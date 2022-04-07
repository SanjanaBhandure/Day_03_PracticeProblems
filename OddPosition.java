package com.Bridgelabz.Day03PracticeProblems;

public class OddPosition {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Elements of given array:");
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println("Odd position of elements: " +arr[i]);
        }
    }
}
