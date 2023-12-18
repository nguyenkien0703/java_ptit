package com.mycompany.bai1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class J01013 {
    static long [] f = new long[2000001];

    public static void main(String[] args) {
        for(int i=0;i<2000001;i++){
            f[i]=0;
            int ok =1;
            for(int j = 2;j<=sqrt(i);j++){
                if(i%j==0){
                    f[i]  = f[j] + f[i/j];
                    ok =0;
                    break;
                }
            }
            if(ok==1){
                f[i] =i;
            }
        }

        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long s = 0;
        for(int i =0;i<t;i++){
            int a= sc.nextInt();
            s+=f[a];
        }
        System.out.println(s);
    }
}
