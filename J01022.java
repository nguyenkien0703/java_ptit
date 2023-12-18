package com.mycompany.bai1;

import java.util.Scanner;

public class J01022 {
    static long [] f = new long[93];
    static long Try(int n , long k ) {
        if(n==1) return 0;
        if(n==2) return  1;
        if (k<= f[n-2]) return Try(n-2, k);
        return Try(n-1, k- f[n-2]);
    }
    public static void main(String[] args) {

        f[0]=0;
        f[1]=1;
        for(int i =2;i<=92;i++){
            f[i]= f[i-1] + f[i-2];
        }

        Scanner sc = new Scanner(System.in);
        int t=  sc.nextInt();
        while (t-- > 0) {
            int n =sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Try(n, k));
        }
    }
}
