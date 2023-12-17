package com.mycompany.bai1;

import java.util.Scanner;

public class J01010 {
    static  char convert(char x ){
        if(x=='0'){
            return '0';
        }else if(x=='1'){
            return  '1';
        }else if(x=='8'){
            return '0';
        }else if(x=='9'){
            return '0';
        }else {
            return '2';
        }
    }

    static String ans(char [] a ){
        for(int i =0;i<a.length;i++){
            a[i]=convert(a[i]);
            if(a[i]=='2'){
                return "INVALID";
            }

        }
        String s = new String(a);
        int ok =0;
        for (int i =0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                ok +=1;
            }
        }
        if(ok ==s.length()){
            return "INVALID";
        }
        while(s.length() > 0 && s.charAt(0)=='0'){
            s=s.substring(1);
        }

        return s;


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(ans(s.toCharArray()));
        }
    }
}
