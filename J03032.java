package com.mycompany.bai1;

import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while( t-- > 0){
            String s = sc.nextLine();
            String [] a = s.split("\\s+");
            for(String x : a ){
                if(x.length()!=0){
                    String tmp =new  StringBuilder(x).reverse().toString();
                    System.out.print(tmp+" ");
                }
            }
            System.out.println("");
        }
    }
}
