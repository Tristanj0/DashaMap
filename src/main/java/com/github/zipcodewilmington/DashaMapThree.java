package com.github.zipcodewilmington;

public class DashaMapThree extends DashaMap {
    public String HashFunctionThree(String input) {
        if (input.length() > 1) {
            return String.valueOf(input.charAt(0) + input.charAt(1)).toLowerCase();
        }
        return null;
    }
}
