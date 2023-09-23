package com.mycompany.bai1;

import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String a, b ;
            a= sc.next();
            b= sc.next();
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);
            BigInteger s = x.multiply(y);
            BigInteger ss = x.gcd(y);
            System.out.println(s.divide(ss));
        }



    }

}
