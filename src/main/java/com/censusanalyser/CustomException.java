package com.censusanalyser;

public class CustomException extends Exception {
    @Override
    public String toString() {
        return "Incorrect File";
    }
}
