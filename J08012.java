package com.mycompany.bai1;

import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        int [] ke = new int[t+1];
        for(int i=0;i<t-1;i++) {
            int a= sc.nextInt(), b= sc.nextInt();
            ke[a]++;
            ke[b]++;
        }
        int cnt =0;
        for(int i=1;i<=t;i++){
            if(ke[i] == t-1){
                cnt++;
            }
        }
        if(cnt ==1 ){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
