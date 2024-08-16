package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] number = new int[5];

        for (int i = 0; i < number.length; i++) {
           number[i] = scan.nextInt();
        }
       for (int i = number.length-1; i >=0; i--) {
            System.out.println(number[i]);
        }
    }
}
        // Create a Scanner object to read input from the console




