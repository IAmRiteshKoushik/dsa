package com.ritesh;

import java.util.Scanner;

public class moreInputs {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    float marks = input.nextFloat();
    // Floating point error occurs when we have more than a certain
    // number of decimal points. Also, an integer input is typecasted 
    // to carry one decimal point when parsed as float. 

    System.out.println(marks);
    input.close();
    }
}