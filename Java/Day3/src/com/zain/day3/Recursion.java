package com.zain.day3;

public class Recursion {
    public static void main(String[] args) {
        printNumbersRecursiv(5);

    }

    public static void printNumbersRecursiv(int number){
        if(number == 0){
            return;
        }
        printNumbersRecursiv(number - 1);
        System.out.print(number);
        return;
    }
}
