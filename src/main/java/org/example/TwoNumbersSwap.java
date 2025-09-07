package org.example;

public class TwoNumbersSwap {
    public static void main(String[] args) {

        int a=30;
        int b=20;
        System.out.println("Before swap: a = " +a+ ", b= " +b );
        a=a+b ; // a now holds the sum of original a and b
        b=a-b; // b now holds the original value of a
        a=a-b; // a now holds the original value of b
        System.out.println("After swap a= " +a+ ",b= "+b);
    }
} //Done by Nabil
