package com.mycompany.bai1;

import java.util.Scanner;

public class J01008 {
    public static void   ptnt(int n ){
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                int cnt =0;
                while(n%i==0){
                    cnt +=1;
                    n/=i;
                }
                if(cnt!=0){
                    System.out.print(i + "(" + cnt +") ");
                }
            }
        }
        if(n!=1){
            System.out.println(n + "("+ 1+")");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =1;i<=t;i++){
            int n= sc.nextInt();
//            System.out.println(n);
            System.out.print("Test " + i+": ");
            ptnt(n);
            System.out.println("");
        }
    }
    
}
