package com.mycompany.bai1.thuc_hanh_lan_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; ++i)
        {
            System.out.print("Buoc " + i + ": ");
            a.add(sc.nextInt());
            Collections.sort(a);
            for (int j : a)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
