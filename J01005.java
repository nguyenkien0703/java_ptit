package com.mycompany.bai1;

import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double n = sc.nextDouble(), h = sc.nextDouble();
            for (double i =1;i<n;i++){
                double p = i/n;
                double kien = h * (Math.sqrt(p));
                System.out.printf("%.6f ", kien);
            }
            System.out.println("");
        }


    }
}
