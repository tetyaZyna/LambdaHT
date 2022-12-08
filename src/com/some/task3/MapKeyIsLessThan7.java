package com.some.task3;

import java.util.HashMap;
import java.util.Map;

public class MapKeyIsLessThan7 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String[] strings = {"1234567", "12345678", "qwertyuiop", "asd", "12", "More than 7"};
        Integer[] integers = {123456789, 1, 45, 22, -235, 1818};

        for (int i = 0; i < 6; i++) {
            map.put(strings[i], integers[i]);
        }

        SumOfKey sumOfKey = (str -> str.length() < 7);
        System.out.println(map);
        System.out.println("Sum of values where the length of the keys is less than 7: " + SumOfKey.sum(map, sumOfKey));
    }
}
