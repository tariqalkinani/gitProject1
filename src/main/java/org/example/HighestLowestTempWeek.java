package org.example;

public class HighestLowestTempWeek {
    public static void main(String[] args) {
            double[] array = {30.98, 29, 18, 78.56, 72, 35, 34.5, 23.78};
            double highest = array[0];
            double smallest = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > highest) {
                    highest = array[i];
                }
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }
            System.out.println("The highest temperature is " + highest);
            System.out.println("The smallest temperature is " + smallest);
        }
    } //Done by Deepa

