package com.mycompany.bai1.thuc_hanh_lan_1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count_1 = 0;
        long count_2 = 0;
        while(n > 0){
            if(n % 10 == 4) {
                count_1++;
            }
            if(n % 10 == 7) count_2++;
            n /= 10;
        }
        long res = count_1 + count_2;
        if(res == 7||res == 4) System.out.println("YES");
        else System.out.println("NO");
    }
}
