package com.mycompany.bai1.thuc_hanh_lan_1.bai12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a= sc.nextLong(), b=sc.nextLong();
        PhanSo A = new PhanSo(a,b);
        a=sc.nextLong();
        b=sc.nextLong();
        PhanSo B = new PhanSo(a,b);
        A.add(B);
        System.out.println(A.getTu()+"/"+A.getMau());
    }
}
