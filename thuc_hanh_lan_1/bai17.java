package com.mycompany.bai1.thuc_hanh_lan_1;

import java.util.Scanner;

public class bai17 {
    static int n , k, cnt =0 ;
    static void Try(int i, String s){
        if(s.length()==k){
            System.out.println(s);
            ++cnt ;
            return;
        }

        for(int j=i;j<=n;j++){
            Try(j+1,s+Integer.toString(j)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        k = sc.nextInt();
        k<<=1;
        Try(1,"");
        System.out.println("Tong cong co "+cnt+" to hop");


    }
}
