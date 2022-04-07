package com.Bridgelabz.Day03PracticeProblems;

public class DuplicateOfArray {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 3, 4, 2, 5, 4, 9, 7, 3};
        System.out.println("Duplicate numbers in array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
        }
    }
}
