package org.example.e71;

public class E71Arrays {
    public static void main(String[] args) {
        int[] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};
        for (int i = 0; i < numbers.length; i++) {
            if (i != 0 & i != 2 & i != 3 & i != 5 & i != 6 & i != 8) {
                System.out.print(numbers[i] + " ");
            }




        }
    }
}