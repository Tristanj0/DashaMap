package com.github.zipcodewilmington;

public class DashaMapOne extends DashaMap {
    public String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }
}
