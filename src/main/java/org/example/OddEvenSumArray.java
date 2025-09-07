package org.example;

public class OddEvenSumArray {
    public static void main(String[] args) {

        int [][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int evenSum = 0;
        int oddSum = 0;


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int value = numbers[i][j];

                if (value % 2 == 0) {
                    evenSum += value;
                } else {
                    oddSum += value;
                }
            }
        }


        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);


    }
} //Done by Wilson
