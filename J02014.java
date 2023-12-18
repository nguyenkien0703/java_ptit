package com.mycompany.bai1;

import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long [] a = new long[n+1];
            long [] b = new long[n+1];
            a[0] = sc.nextLong();
            b[0] =a[0];
            for(int i =1;i<n;i++) {
                a[i] = sc.nextLong();
                b[i] = a[i] + b[i-1];
            }
            int ok =0;
            for(int i=1;i< n;i++) {
                if((b[n-1] - b[i]) == b[i-1]) {
                    ok =1;
                    System.out.println(i+1);
                    break;
                }
            }
            if(ok==0){
                System.out.println(-1);
            }

        }

    }
}
