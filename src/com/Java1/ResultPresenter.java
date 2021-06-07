package com.Java1;

public class ResultPresenter {
    public static void present(ResultInterface result) {
        System.out.print("Result multiplication of two BigIntegers is: ");
        System.out.println(result.result());
    }
}
