package com.Java1;

import java.math.BigInteger;

public class Result implements ResultInterface{
    private final BigInteger result;

    Result(InputInterface input) {
        this.result = input.number1().multiply(input.number2());
    }

    public BigInteger result() {
        return this.result;
    }
}
