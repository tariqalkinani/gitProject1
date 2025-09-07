package org.example;

public class PrintEvenNumbersOnly {
    public static void main(String[] args) {
        int [][] numbers={
                {2,5,8},
                {3,6,9},
                {4,7,10}

        };
        for(int r=0;r<numbers.length;r++){
            for( int c=0;c<numbers[r].length;c++){
                if(numbers[r][c] % 2 ==0){
                    System.out.print(numbers[r][c] + " ");
                }
            }


        }



    }
}  //Done by Andrae

