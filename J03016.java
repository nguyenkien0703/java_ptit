package com.mycompany.bai1;

import java.util.Scanner;
//dáu hiệu chia hết cho 11: tổng kĩ tự ở vịtrisis chẵn trừ đi tổng
//kí tự ở vị trí lẻ
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String s = sc.nextLine();
            int sum1 =0,sum2=0;
            for(int i=0;i<s.length();i+=2){
                sum1+= (s.charAt(i)-'0');
            }

            for(int i=1;i<s.length();i+=2){
                sum2+= (s.charAt(i)-'0');
            }
            if((sum1-sum2)%11!=0){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
        }
    }
}
