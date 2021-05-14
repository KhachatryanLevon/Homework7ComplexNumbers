package com.company;

public class Complex {

    private double realPart = 0;
    private double imaginaryPart = 0;


    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void addComplex(Complex complex) {
        realPart = realPart + complex.getRealPart();
        imaginaryPart = imaginaryPart + complex.getImaginaryPart();
    }

    public void subtractComplex(Complex complex) {
        realPart = realPart - complex.getRealPart();
        imaginaryPart = imaginaryPart - complex.getImaginaryPart();
    }

    public Complex() {
        setRealPart(0);
        setImaginaryPart(0);
    }

    public Complex(double realPart, double imaginaryPart) {
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }

    public void outComplexNumber() {
        if (realPart == 0 && imaginaryPart == 0) {
            System.out.println(0);
        }
        if (realPart == 0 && imaginaryPart != 0) {
            System.out.println(imaginaryPart + "i");
        }
        if (realPart != 0 && imaginaryPart == 0) {
            System.out.println(realPart);
        }
        if (realPart != 0 && imaginaryPart > 0) {
            System.out.println(getRealPart() + " + " + getImaginaryPart() + "i");
        }
        if (realPart != 0 && imaginaryPart < 0) {
            System.out.println(getRealPart() + " - " + -getImaginaryPart() + "i");
        }
    }
}
