package com.some.task1;

public class AverageOddNumbersDivisibleBy5 {

    public static void main(String[] args) {
        int nums[] = {5, 15, 9, 3, 1};
        Operational isOdd = n -> n % 2 == 1;
        Operational isDivisibleBy5 = n -> n % 5 == 0;
        System.out.println("Average is: " + average(nums, isOdd, isDivisibleBy5));
    }

    private static double average (int[] nums, Operational isOdd, Operational isDivisibleBy5){
        int sum = 0, count = 0;
        for (int i : nums){
            if (isOdd.calculate(i) && isDivisibleBy5.calculate(i)){
                sum += i;
                count += 1;
            }
        }
        double average = sum/count;
        return average;
    }
}
