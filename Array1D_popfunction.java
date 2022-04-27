package com.company;
import java.util.Scanner;
public class Array1D_popfunction {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store");
        n=sc.nextInt();
        int [] array=new int[10];
        System.out.println("Elements in array are:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array Elements are");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        System.out.println("Poping an Element in Array");
        for(int i=0;i<n-1;i++){
            array[i]=array[i+1];
            System.out.println(array[i]);
        }

    }
}
