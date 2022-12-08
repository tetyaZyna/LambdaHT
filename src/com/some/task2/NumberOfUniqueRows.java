package com.some.task2;

public class NumberOfUniqueRows {

    public static void main(String[] args) {
        final String text = """
                row 1\n
                row 1 longer than 8\n
                row 1 longer than 8\n
                row 2 longer than 8\n
                """;
        UniqueRows uniqueRows = (str -> str.length() > 8);
        System.out.println("Unique rows longer than 8: " + UniqueRows.getCount(text, uniqueRows));

    }
}
