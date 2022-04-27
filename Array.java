package com.company;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements you want to store ");
        n=sc.nextInt();
        int[] array=new int[10];
        System.out.println("Elements in Array are: ");
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }

}
