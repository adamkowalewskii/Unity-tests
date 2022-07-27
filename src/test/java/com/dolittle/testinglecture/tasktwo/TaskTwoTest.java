package com.dolittle.testinglecture.tasktwo;

import com.dolittle.testinglecture.ArithmeticalOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaskTwoTest {

    @Test
    void shouldMultiplyNumbers(){
        //given
        int a = 4;
        int b = 5;
        int expected = 20;
        WeirdMultiplier multiplier = new WeirdMultiplier();

        //when
        int number = multiplier.multiply(a,b);

        //then
        assertEquals(expected, number);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionOnEqualsNumbers(){
        int a = 4;
        int b = 4;
        WeirdMultiplier multiplier = new WeirdMultiplier();

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> multiplier.multiply(a,b));
        assertEquals("First number is equal to second number", illegalArgumentException.getMessage());
    }
    @Test
    void shouldThrowIllegalArgumentExceptionOnTwoEvenNumbers(){
        int a = 4;
        int b = 8;
        WeirdMultiplier multiplier = new WeirdMultiplier();

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> multiplier.multiply(a,b));
        assertEquals("Both numbers are even", illegalArgumentException.getMessage());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionOnFirstNumberBiggerThen144(){
        int a = 1454;
        int b = 7;
        WeirdMultiplier multiplier = new WeirdMultiplier();

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> multiplier.multiply(a,b));
        assertEquals("First number is bigger then 144", illegalArgumentException.getMessage());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionOnSecondNumberBiggerThen144(){
        int a = 14;
        int b = 12347;
        WeirdMultiplier multiplier = new WeirdMultiplier();

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> multiplier.multiply(a,b));
        assertEquals("Second number is bigger then 144", illegalArgumentException.getMessage());
    }
}
