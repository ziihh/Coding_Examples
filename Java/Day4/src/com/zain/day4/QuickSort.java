package com.zain.day4;

// Pseudocode: https://en.wikipedia.org/wiki/Quicksort
public class QuickSort {

    static char[] numbers = {'a', 'c', 'f', 'q', 'b', 't'};

    public static void main(String[] args) {
        quickSort(0, numbers.length - 1);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\n");
        }
    }

    static void quickSort(int lo, int hi){
        if(lo < hi){
            int partitionIndex = partition(lo, hi);
            quickSort(lo, partitionIndex -1);
            quickSort(partitionIndex + 1, hi);
        }
    }

    private static int partition(int lo, int hi) {
        char pivot = numbers[hi];
        int i = lo;

        for(int j = lo; j < hi; j++){
            if(numbers[j] < pivot){
                swapInArray(i, j);
                i = i + 1;
            }
        }
        swapInArray(i, hi);
        return i;
    }

    static void swapInArray(int i, int j){
        char temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;

    }
}
