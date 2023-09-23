package com.mycompany.bai1;

import java.util.Scanner;
// lấy ra xâu con có thứ tự từ điển lớn nhất
public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(),x="";
        Character k ='a';
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>=k){
                k=s.charAt(i);
                x=k+x;
            }
        }
        System.out.println(x);
    }
}
