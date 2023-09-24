package com.mycompany.bai1.thuc_hanh_lan_1;

import java.util.ArrayList;
import java.util.Scanner;


public class bai3 {
    static Integer mod = 1000000007;
    static int[] ar = new int[2000005];
    static long[] sum = new long[2000005];
    static void snt() {
        for(int i = 1; i < 2000005; i++) ar[i] = 0;
        ar[0] = ar[1] = 1;
        for(int i = 2; i <= Math.sqrt(2000005); i++) {
            if(ar[i] == 0) {
                for(int j = i*2; j < 2000005; j += i) {
                    ar[j] = 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        snt();
        for(int i = 2; i < 2000005; i++) {
            if(ar[i] == 0) {
                sum[i] += i;
                for(int j = i*2; j < 2000005; j += i) {
                    int x = j;
                    while(x%i == 0) {
                        sum[j] += i;
                        x/=i;;
                    }
                }
            }
        }
        int n = sc.nextInt();
        long ans = 0;
        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            ans += sum[x];
        }
        System.out.println(ans);
    }


}
