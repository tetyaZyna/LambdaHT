package com.some.task4;

import java.util.Arrays;
import java.util.List;

public class ConnectIntToStr {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 4, 3, 2, 1);

        String intToStr = "";

        for (int integer : integerList){
            intToStr += Integer.toString(integer);
        }
        System.out.println("List: " + integerList);
        System.out.println("Result: " + intToStr);
    }
}
