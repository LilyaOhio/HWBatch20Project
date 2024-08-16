package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] size = new int[5];
        for (int i = 0; i < size.length; i++) {
            size[i] = scan.nextInt();
        }
        for (int i = 0; i < size.length; i++) {
            System.out.println(size[i]*10);
        }
        }
    }
