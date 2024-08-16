package org.example.e83;

public class E83NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] yes = new int[5][10];
        for (int row = 0; row < yes.length; row++) {
            for (int column = 0; column < yes[row].length; column++) {
                yes[row][column] = (row + 1) * (column + 1);

            }
        }
        for (int row = 0; row < yes.length; row++) {
            for (int column = 0; column < yes[row].length; column++) {
                System.out.print(yes[row][column] + " ");

            }
            System.out.println();
        }
    }
}


