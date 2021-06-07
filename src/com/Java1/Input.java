package com.Java1;

import java.math.BigInteger;
import java.util.Scanner;

public class Input implements InputInterface {
    public final BigInteger number1;
    public final BigInteger number2;

    Input() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Input number1: ");
        this.number1 = inputScanner.nextBigInteger();

        System.out.print("Input number2: ");
        this.number2 = inputScanner.nextBigInteger();
    }

    public Input(BigInteger number1, BigInteger number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public BigInteger number1() {
        return number1;
    }

    @Override
    public BigInteger number2() {
        return number2;
    }
}
