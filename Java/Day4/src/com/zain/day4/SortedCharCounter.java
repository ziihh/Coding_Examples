package com.zain.day4;

import java.util.HashMap;
import java.util.Map;

public class SortedCharCounter {

    static char[] charArray = {'a', 'a', 'n', 's', 'j', 'i', 'a', 'i', 'h', 'w'};

    public static void main(String[] args) {
        //System.out.print(CharString);
        countChar();
    }

    static String CharString = new String(charArray);
    static Map<Character, Integer> charValue = new HashMap<>();



    public static void countChar(){

        for(int i = 0; i < charArray.length; i++){
            if(charValue.containsKey(charArray[i])){
                // pluss that key's value with 1;
                charValue.replace(charArray[i], charValue.get(charArray[i]) + 1);

            } else {
                // add that char as key and add the value 1.
                charValue.put(charArray[i], 1);
            }
          // System.out.print(charArray[i]);

        }
        for(Character key : charValue.keySet()){
            System.out.print(key.charValue() + " - " + charValue.get(key) + "\n");
        }

    }
}
