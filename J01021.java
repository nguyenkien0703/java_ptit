/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01021 {
    static Long  MOD = 1000000007L;
    public static long mu(Long a, Long b , Long c ){
        Long res = 1L ;
        res%=c;
        while(b > 0){
            if(b%2==1){
                res *=a;
                res%=c;
            }
            a*=a;
            a%=c;
            b/=2;
        }
        return res ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true ){
            Long a= sc.nextLong(), b = sc.nextLong();
            if( a== 0 && b ==0){
                return ;
            }
            System.out.println(mu(a,b, MOD));
        }

    }
}
