package com.mycompany.bai1;

import java.util.Scanner;

public class J03006
{

    public static void   check(String s ){
        for(int i=0;i< s.length();i++){
            Character c = s.charAt(i);
            if(c!='2' && c!='3'  && c!='5' && c!='7'){
                System.out.println("NO");
                return ;
            }
        }
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            check(s);
        }
    }
}
