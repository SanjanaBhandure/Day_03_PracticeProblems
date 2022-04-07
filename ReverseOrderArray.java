package com.Bridgelabz.Day03PracticeProblems;
import java.util.Scanner;

public class ReverseOrderArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int number = sc.nextInt();
        int arr[] = new int[number];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = number - 1; i >= 0; i--) {
            System.out.println(arr[i]+ " ");
        }
    }
}
