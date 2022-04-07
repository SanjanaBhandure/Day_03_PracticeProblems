package com.Bridgelabz.Day03PracticeProblems;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int num, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        num = s.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:" + arr[num - 2]);
        //System.out.println("Smallest:" + a[0]);
    }
}

