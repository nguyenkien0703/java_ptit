package com.mycompany.bai1;

import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);;
        int t = sc.nextInt();
        sc.nextLine();
        while   (t-- > 0){
            String a= sc.nextLine(), b= sc.nextLine();
            if(!a.equals(b)){
                System.out.println(Math.max(a.length(),b.length()));
            }else {
                System.out.println(-1);
            }
        }
    }
}
