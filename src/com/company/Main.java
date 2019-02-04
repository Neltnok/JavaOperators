// create a print statement describing the  addition operator in class Main
    // embed within the print statement the calculation for adding two integers
// create a print statement describing the  subtraction operator in class Main
    // embed within the print statement the calculation for subtracting two integers
// create a print statement describing the multiplication operator in class Main
    // embed within the print statement the calculation for multiplying two doubles
// create a print statement describing the division operator in class Main
    // embed within the print statement the calculation for dividing two doubles
// create a print statement describing the modulo operator in class Main
    // embed within the print statement the calculation for calculating the modulus of an int modulo double.




package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        // create the operand integer variables
        int operand1 = 7;
        int operand2 = 5;

        double operand3 = 2.5;
        double operand4 = 6.3;

        System.out.println("Basic operator demonstration ");
        // addition operation demonstration
        System.out.println(" 7 + 5 = " + (operand1 + operand2) );
        // subtraction operation demonstration
        System.out.println(" 7 - 5 = " + (operand1 - operand2));
        // multiplication operation demonstration
        System.out.println(" 2.5 * 6.3 = " + (operand3 * operand4));
        // division operation demonstration
        System.out.println(" 6.3 / 2.5 = " + (operand4 / operand3));
        // modulus operation demonstration
        System.out.println( "6.3 % 5 = " + (operand4 % operand2));

    }
}
