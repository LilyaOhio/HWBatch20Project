package org.example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] array = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
int []rowSum=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            int sum=0;
            for (int j = 0; j < array[i].length; j++) {
                sum+= array[i][j];
            }
            rowSum[i]=sum;
        }
        for(int sum: rowSum){
            System.out.println(sum);

        }
        // Declare an array to store the sums of each row

        // Use nested loops to iterate through the 2D array and calculate the sum of each row

        // Store the sums in the new array

        // Print the values of the new array
    }
}
