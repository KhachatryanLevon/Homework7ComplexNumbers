package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double realPart1;
        double imaginaryPart1;
        double realPart2;
        double imaginaryPart2;

        System.out.println("Enter the real part of the first complex number");
        realPart1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number");
        imaginaryPart1 = scanner.nextDouble();
        Complex complex1 = new Complex(realPart1, imaginaryPart1);

        System.out.println("Enter the real part of the second complex number");
        realPart2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number");
        imaginaryPart2 = scanner.nextDouble();
        Complex complex2 = new Complex(realPart2, imaginaryPart2);

        System.out.println("The first complex number is ");
        complex1.outComplexNumber();

        System.out.println("The second complex number is ");
        complex2.outComplexNumber();

        Complex complexDifference = new Complex(realPart1, imaginaryPart1);
        complexDifference.subtractComplex(complex2);
        System.out.println("The difference between first and second complex numbers is ");
        complexDifference.outComplexNumber();

        Complex complexSum = new Complex(realPart1, imaginaryPart1);
        complexSum.addComplex(complex2);
        System.out.println("The sum of first and second complex numbers is ");
        complexSum.outComplexNumber();


    }
}
