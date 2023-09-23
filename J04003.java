package com.mycompany.bai1;

import java.util.Scanner;

public class J04003 {
    private Long  tu, mau;
    public J04003(){}

    public J04003(Long tu, Long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public void RG(){
        Long  a = this.tu, b = this.mau;
        while(b!=0){
            Long  r = a%b;
            a = b;
            b= r;
        }
        this.tu /=a;
        this.mau /=a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long tu = sc.nextLong();
        Long mau= sc.nextLong();
        J04003 ps = new J04003(tu, mau);
        ps.RG();
        System.out.println(ps.tu+"/"+ps.mau);

    }
}
