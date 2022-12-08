package com.some.task2;

import java.util.HashMap;
import java.util.Map;

public interface UniqueRows {
    boolean isLongerThanNeed(String str);

    static int getCount(String str, UniqueRows uniqueRows){
        Map<String, Integer> map = new HashMap<>();
        int count = 0;

        String[] lines = str
                .replace(",\n", "\n")
                .replace(".\n", "\n")
                .replace(";\n", "\n")
                .replace("\n\n", "\n")
                .split("\n");

        for (String line : lines) {

            if (!uniqueRows.isLongerThanNeed(line)) continue;

            if (!map.containsKey(line)) {
                map.put(line, 0);
                count++;
            }

        }
        return count;
    }
}
