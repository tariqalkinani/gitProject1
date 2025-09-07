package org.example;

public class SumArrayElements {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 13, 12, 11, 23, 19, 24};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum of all elements in array is " + sum);
    }
} //Done by Deepa


