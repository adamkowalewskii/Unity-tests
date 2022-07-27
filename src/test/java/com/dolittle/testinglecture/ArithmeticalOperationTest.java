package com.dolittle.testinglecture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithmeticalOperationTest {

    //Should_ThrowException_When_AgeLessThan18
    //Should_FailToWithdrawMoney_ForInvalidAccount
    //Should_FailToAdmit_IfMandatoryFieldsAreMissing
    @Test
    void shouldAddNumbersGreaterThanZero() {
        // given
        Integer first = 5;
        Integer second = 1;
        Integer expectedResult = 6;
        // when
        Integer actualResult = ArithmeticalOperation.add(first, second);
        // then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenFirstNumberIsZero() {
        // given
        Integer first = 0;
        Integer second = 1;

        // when then
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> ArithmeticalOperation.add(first, second));
        assertEquals("Operation you are trying to perform is beyond my ability.", illegalArgumentException.getMessage());
    }
}