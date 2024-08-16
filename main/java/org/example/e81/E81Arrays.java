package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values

        int[][] array = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]<0 && array[i][j] % 2 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}


// Use nested loops to iterate through the 2D array and sum the elements that are on even indexes and even rows

        // Print the calculated sum
