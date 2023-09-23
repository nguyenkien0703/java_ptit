package com.mycompany.bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum =0;
        String s;
        while(sc.hasNext()) {
            s = sc.next();
            try{
//                chuỗi sang số nguyên
                sum += Integer.parseInt(s);
            }catch (Exception e ){}
        }
        System.out.println(sum);
    }
}
