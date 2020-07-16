package com.zain.day3;

import java.security.PublicKey;

public class ReverseNumberRecursion {
    public static void main(String[] args) {
       // reverseNumberRecursive(1);
       // twoTable(10);
        table(2);
    }

    public static void reverseNumberRecursive(int number){
        if(number == 6){
            return;
        }
        reverseNumberRecursive(number + 1);
        System.out.print(number);
        return;
    }

    public static void twoTable(int number){
        if(number == 0){
            return;
        }
        twoTable(number - 1);
        System.out.print("2 x " + number + " = " + 2 * number + "\n");
        return;
    }

    // non recursive function.
    public static void table(int number){
        int result;
        for(int i = 1; i <= 10; i++){
            result = number * i;
            System.out.print("2 x " + i + "  = " + result + "\n");
        }
    }
}
