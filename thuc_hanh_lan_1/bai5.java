package com.mycompany.bai1.thuc_hanh_lan_1;

import java.util.Scanner;

public class bai5 {
    static int n ;

    static long k;
    static long [] f = new long[100];
    static void init(){
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=92;i++){
            f[i]= f[i-2] + f[i-1];
        }
    }

    static long solve(int n ,long k ){
        if(n==1){
            return 0;
        }
        if(n==2) return 1;
        if(k<=f[n-2]){
            return solve(n-2,k);
        }else {
            return solve(n-1,k-f[n-2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        init();
        while (t-- >0){
            n=sc.nextInt();
            k=sc.nextLong();
            System.out.println(solve(n,k));
        }


    }
}
