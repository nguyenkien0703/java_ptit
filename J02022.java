package com.mycompany.bai1;

import java.util.Arrays;
import java.util.Scanner;

public class J02022 {
    static int n ;
    static int check(String s ){
        for(int i=1;i<n;i++){
            if(Math.abs(s.charAt(i) -s.charAt(i-1)) == 1){
                return 0;
            }
        }
        return 1;
    }
    static void Try(String s , boolean [] f){
        if(s.length()==n){
            if(check(s)==1){
                System.out.println(s);
            }
            return;
        }else {
            for(int i=1;i<=n;i++){
                if(!f[i]){
                    f[i]= true ;
                    if(s.length() + 1  <=n){
                        Try(s+ Integer.toString(i), f );
                    }
                    f[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            n=sc.nextInt();
            Try("", new boolean[n+5]);
            System.out.println();

        }
    }
}
