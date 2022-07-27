package com.dolittle.testinglecture.tasktwo;



//TDD – napisz najpierw testy do funkcji, która będzie mnożyć dwie liczby. Liczby maja spełniać następujące warunki:
//- nie mogą być sobie równe
//- Jeśli jedna jest parzysta to druga musi być nie parzysta
//- Jeśli którakolwiek jest ujemna to najpierw musi być zamieniona dodatnia
//- Maksymalna liczba jaka można przekazać to 144
//- Jeśli jakiś warunek jest niespełniony, powinien zostać rzucony IllegalArgumentException ze stosownym opisem
public class WeirdMultiplier {


    public Integer multiply(Integer firstNumber, Integer secondNumber) {

        if(firstNumber == secondNumber){
            throw new IllegalArgumentException("First number is equal to second number");
        }

        if(firstNumber % 2 == 0 && secondNumber % 2 == 0){
            throw new IllegalArgumentException("Both numbers are even");
        }

        if(firstNumber > 144){
            throw new IllegalArgumentException("First number is bigger then 144");
        }
        if(secondNumber > 144){
            throw new IllegalArgumentException("Second number is bigger then 144");
        }


        return firstNumber * secondNumber;
    }
}
