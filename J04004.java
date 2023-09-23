package com.mycompany.bai1;

import java.util.Scanner;

public class J04004 {
    private Long  tu, mau;
    public J04004(){}

    public J04004(Long tu, Long mau) {
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
    public static J04004 tong(J04004 a, J04004 b ){
        a.RG();
        b.RG();
        J04004 ps= new J04004();
        ps.mau= a.mau * b.mau;
        ps.tu = a.mau * b.tu + a.tu * b.mau;
        ps.RG();
        return ps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long tu1 = sc.nextLong();
        Long mau1= sc.nextLong();
        Long tu2 = sc.nextLong();
        Long mau2= sc.nextLong();
        J04004 ps1 = new J04004(tu1, mau1);
        J04004 ps2= new J04004(tu2, mau2);
        J04004 ps = tong(ps1, ps2);
        System.out.println(ps.tu+"/"+ps.mau);





    }
}
