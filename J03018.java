package com.mycompany.bai1;

import java.util.Scanner;

public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-- > 0 ){
            String s = sc.nextLine();
            int ans =0;
            for(int i=0;i<s.length();i++){
                ans =ans * 10 + s.charAt(i)-'0';
                ans %=4;
            }
            if(ans ==0){
                System.out.println(4);
            }else System.out.println(0);



        }
    }
}
