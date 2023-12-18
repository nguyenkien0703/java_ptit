package com.mycompany.bai1;

import java.util.Scanner;

public class J02020 {
    static int n, k, ok;
    static int [] a = new int[100];
    static int cnt =0;
    static void ktao() {
        for(int i=1;i<=k;i++) {
            a[i] =i;
        }
    }
    static void sinh() {
        int i = k;
        while(i>=1 && a[i] == n-k + i) {
            --i;
        }
        if(i==0){
            ok =0;
        }else {
            a[i]++;
            for(int j =i+1;j<=k;j++){
                a[j] = a[j-1] + 1;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        k = sc.nextInt();
        ok =1;
        ktao();
        int kienkien =0;
        while (ok==1) {
            for(int i=1;i<=k;i++){
                System.out.print(a[i]+" ");
            }
            kienkien++;
            System.out.println("");
            sinh();
        }
        System.out.println("Tong cong co "+ kienkien +" to hop");

    }
}
