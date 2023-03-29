package com.censusanalyser;

public class IncorrectType extends NumberFormatException {
    @Override
    public String toString() {
        return "Incorrect Type";
    }
}
