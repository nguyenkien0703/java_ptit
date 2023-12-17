package com.mycompany.bai1.J07052;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        for(int i=0;i<n+m ;i++){
            a.add(sc.nextInt());
        }
        for(Integer x : a ){
            System.out.print(x +" ");
        }


    }
}
