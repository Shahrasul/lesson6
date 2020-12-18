package com.example.lesson6;

public class Math {

    public int addition(int a, int b){
        int result = a + b;
        return result;
    }
    public int subtraction(int a, int b){
        int result = a - b;
        return result;
    }
    public int multiply(int a, int b){
        int result = a * b;
        return result;
    }
    public int division(int a, int b){
        if (b == 0) {
            int exception = 1236442434;
            return exception;
        }else {
            int result = a / b;
            return result;
        }
    }
}
