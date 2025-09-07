package org.example;

public class DuplicateElementsFromArray {
    public static void main(String[] args) {

        String[] names = {"John", "Brad", "Tom", "Ali", "Ryan","Brian", "Tom", "Kyle", "Kelli", "Steph", "Kelli"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate names: " + names[i]);
                }
            }
        }
    }
}  //Done by Tariq
