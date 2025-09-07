package Projects;

public class OddAndEvenSumArray {
    public static void main(String[] args) {

        int[][] numbers={
                {1,3,4,6,8},
                {5,7,3,9,8,4},
                {2,4,7},
                {5,1,7,9}
        };
        int sum1=0;
        int sum2=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                if(numbers[i][j]%2==0) {
                    sum1 = sum1 + numbers[i][j];




                }else if(numbers[i][j]%2!=0){
                    sum2 = sum2 + numbers[i][j];


                }

            }

        }System.out.println("The sum of even numbers= " +sum1 );
        System.out.println("The sum of odd numbers= " +sum2 );

    }
    }
