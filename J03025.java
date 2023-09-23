package com.mycompany.bai1;

import java.util.Scanner;

public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        while( t-- > 0){
            String s = sc.nextLine();
            int len = s.length(), l = 0, r= len-1;
            int cnt =0;
            while(l<= r){
                if(s.charAt(l) == s.charAt(r)){
                    ++l;--r;
                }else {
                    ++cnt ;
                    ++l;--r;
                }
            }
            if(cnt ==0){
                if(len%2==1){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }else if(cnt ==  1 ){
                System.out.println( "YES");
            }else {
                System.out.println("NO");
            }

        }

    }
}
