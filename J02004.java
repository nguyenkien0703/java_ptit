/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02004 {
    public static String check(int n, int [] a ){
        int l =0, r= n-1;
        while(l<=r){
            if(a[l]!=a[r]){
                return "NO";
            }
            ++l;--r;
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [] a = new int [n+1];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            System.out.println(check(n, a));
        }
    }
    
}
