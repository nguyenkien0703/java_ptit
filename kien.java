package com.mycompany.bai1;

import java.lang.reflect.Array;
import java.util.*;

public class kien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kien ="NGUYEN      van kien    2020-2021 dong/nam";
        String [] a = kien.trim().replaceAll("\\s+", " ").toLowerCase().split("[\\s/]+");
        for(String x : a )
            System.out.println(x);


    }
}
