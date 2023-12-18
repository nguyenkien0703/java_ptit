package com.mycompany.bai1;

import java.util.Scanner;

//kien
public class J01025 {
    static int MIN(int a,int b ,int c,int d ) {
        return Math.min(Math.min(Math.min(a,b), c),d);
    }
    static int MAX(int a, int b ,int c, int d) {
        return  Math.max(Math.max(Math.max(a,b), c),d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1x = sc.nextInt(), a1y = sc.nextInt(), a2x = sc.nextInt(), a2y = sc.nextInt();
        int b1x = sc.nextInt(), b1y = sc.nextInt(), b2x = sc.nextInt(), b2y = sc.nextInt();

        int minx = MIN(a1x,a2x,b1x,b2x), maxx = MAX(a1x,a2x,b1x,b2x) ;
        int miny = MIN(a1y,a2y,b1y,b2y), maxy= MAX(a1y,a2y,b1y,b2y) ;
        int result = Math.max(maxx - minx, maxy - miny);
        System.out.println(result * result);


    }

}
