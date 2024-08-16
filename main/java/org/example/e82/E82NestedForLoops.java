package org.example.e82;

public class E82NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given pattern values
        String[][] pattern = {
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}
        };
        for (int j = 0; j < pattern.length; j++) {//outer row
            for (int i = 0; i <= 5; i++) {//inner row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
