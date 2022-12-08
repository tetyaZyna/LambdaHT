package com.some.task3;

import java.util.Map;

public interface SumOfKey {
    boolean isLessThanNeed(String str);

    static int sum(Map<String, Integer> map, SumOfKey sumOfKey){
        int sum = 0;

        for (String str : map.keySet()){
            if (sumOfKey.isLessThanNeed(str)){
                sum += map.get(str);
            }
        }
        return sum;
    }
}
