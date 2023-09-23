package com.mycompany.bai1;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            String tmp_result = String.valueOf(a.subtract(b).abs());
            int maxx = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
            while(tmp_result.length() < maxx){
                tmp_result="0"+ tmp_result;
            }
            System.out.println(tmp_result);


    }
}
