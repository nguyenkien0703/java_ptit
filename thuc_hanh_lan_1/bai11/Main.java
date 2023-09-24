package com.mycompany.bai1.thuc_hanh_lan_1.bai11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b= sc.nextLong();
        Phanso A = new Phanso(a,b);
        A.rutgon();
        System.out.println(A.getTu()+"/"+A.getMau());
    }
}
