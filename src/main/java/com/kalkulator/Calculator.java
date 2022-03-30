package com.kalkulator;

public class Calculator {

    public static void main(String[] args){
    Calculator calculator = new Calculator();
    calculator.add(7, 6);
    calculator.sub(5, 4);
    System.out.println("It works!");
    }

    public int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public int sub(int x, int y) {
        int result = y - x;
        return result;
    }
}
