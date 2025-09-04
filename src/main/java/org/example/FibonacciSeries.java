package org.example;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // number of terms to display
        int first = 0, second = 1;

        System.out.println("First " + n + " numbers of the Fibonacci series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // generate next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
