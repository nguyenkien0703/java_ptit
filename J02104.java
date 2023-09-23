package com.mycompany.bai1;

import java.util.Scanner;

public class J02104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [][] a = new int [n+5][n+5];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int x = sc.nextInt();
                a[i][j]=x;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if( i<= j && a[i][j]==1){
                    System.out.println("("+String.format("%d,",i) + String.format("%d", j) + ")");
                }
            }
        }
    }
}
