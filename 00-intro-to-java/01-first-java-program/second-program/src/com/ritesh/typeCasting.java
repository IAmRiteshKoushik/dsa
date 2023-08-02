package com.ritesh;

import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // int num = input.nextInt();
        // System.out.prinln(num);

        // -- Type Casting
        int num = (int)(67.56f);
        System.out.println(num);

        // -- Automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // a % 256 = 1
        System.out.println(b);

        // -- Type promotions during computation
        byte c = 40;
        byte d = 50;
        byte e = 100;
        // byte f = c * d / e; This operation is not possible as the
        // computation upgrades things to int which cannot be converted
        // to byte without type casting 
        int f = c * d / e;
        System.out.println(f);

        // In JAVA we use : unicode 
        System.out.println("नमस्ते");

        // Rule of thumb
        // Type conversions always happen upwards (to the higher type)
        // float + int - double = float - double = double


        input.close();
    }
}