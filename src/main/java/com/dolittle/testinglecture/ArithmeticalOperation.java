package com.dolittle.testinglecture;

public class ArithmeticalOperation {


    public static Integer add(Integer first, Integer second) {
        if (first == 0 || second == 0) {
            throw new IllegalArgumentException("Operation you are trying to perform is beyond my ability.");
        }
        return first + second;
    }
}
