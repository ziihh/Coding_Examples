package com.zain.day3;

import java.util.ArrayList;

public class StarParttern {
    public static void main(String[] args) {
        pattern("*************");
    }

    public static void pattern(String stars){
        ArrayList<Character> charArrayList = new ArrayList<Character>();
        for(char c : stars.toCharArray()){
            charArrayList.add(c);
        }
        int size = charArrayList.size();
        for(int i = 0; i < size; i++){
            System.out.print(stars + "\n");

            if(i < size / 2) {
                charArrayList.remove(0);
                charArrayList.remove(charArrayList.size() - 1);
            } else {
                charArrayList.add(0, '*');
                charArrayList.add(charArrayList.size() - 1, '*');
            }

            Character[] characters = charArrayList.toArray(new Character[charArrayList.size()]);
            stars = "";

            for(Character c : characters ){
                stars += c.charValue();
            }
        }
    }
}
