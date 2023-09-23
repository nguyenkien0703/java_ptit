package com.mycompany.bai1;

import java.util.Arrays;
import java.util.Scanner;

public class J02035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- >0){
            int n = sc.nextInt();

            int [] a = new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ok =0;
            for(int i=1;i<n;i++){
                if(a[i] < a[i-1]){
                    ok =1;
                    System.out.println(i);
                    break;
                }
            }
            if(ok==0){
                System.out.println(0);
            }
        }
    }
}
