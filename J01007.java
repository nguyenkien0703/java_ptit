package com.mycompany.bai1;

import java.util.Arrays;
import java.util.Scanner;

public class J01007 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long [] a  = new long[95];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<=92;i++){
            a[i]= a[i-1] + a[i-2];
        }
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
           int index = Arrays.binarySearch(a,0,92,n);
           if(index< 0){
               System.out.println("NO");
           }else {
               System.out.println("YES");

           }
        }

    }
}
