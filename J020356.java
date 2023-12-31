package com.mycompany.bai1;

import java.util.Scanner;



public class J020356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        if(n * 9 <= s||s == 0) System.out.println(-1 + " " + -1);
        else {
            String Max = "", Min = "";
            int s_max = s;
            for(int i = 1;i <= n;i++){
                if(s_max >= 9) {
                    s_max -= 9;
                    Max += '9';
                }
                else{
                    if(s_max == 0) Max += '0';
                    else {
                        Max += String.valueOf(s_max);
                        s_max = 0;
                    }
                }
            }
            int s_min = s - 1;
            for(int i = 1;i <= n;i++){
                if(s_min >= 9){
                    s_min -= 9;
                    Min = '9' + Min;
                }
                else {
                    if(i == n){
                        Min = String.valueOf(1 + s_min) + Min;
                    }
                    else if(s_min == 0){
                        Min = '0' + Min;
                    }
                    else {
                        Min = String.valueOf(s_min) + Min;
                        s_min = 0;
                    }
                }
            }
            System.out.println(Min + " " + Max);
        }
    }
}
