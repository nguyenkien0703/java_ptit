package com.mycompany.bai1.thuc_hanh_lan_1;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            s = s.replaceAll("\\s+", " ");
            String[] a = s.split(" ");
            for (String i : a)
            {
                StringBuilder tmp = new StringBuilder(i);
                System.out.print(tmp.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
