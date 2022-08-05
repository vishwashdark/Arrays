package com.company;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[];
        a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Add elements into array");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Elements in Array are");
            System.out.println(a[i]);
        }
    }
}
