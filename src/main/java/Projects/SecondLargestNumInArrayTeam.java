package Projects;

public class SecondLargestNumInArrayTeam {
    public static void main(String[] args) {

        int[] numbers={10,20,5,30,80,150,90,60};
        int largest=numbers[1];
        int secondLargest=numbers[2];

        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>largest){
                secondLargest=largest;
                largest=numbers[i];
            }else if(numbers[i]>secondLargest&&numbers[i]!=largest){
                secondLargest=numbers[i];
            }

        } // Deepa
        System.out.println(secondLargest);
        System.out.println(); // For clone repo practice
        System.out.println(); // For clone repo practice
    }
}
