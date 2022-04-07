package com.Bridgelabz.Day03PracticeProblems;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        int num, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Ascending order of array elements: ");
        for (int i = 0; i < num - 1; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println(arr[num - 1]);
    }
}
