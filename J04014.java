package com.mycompany.bai1;

import java.util.Scanner;

public class J04014 {
    private Long  tu, mau ;

    public J04014(Long tu, Long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public J04014() {
    }

    public void rutgon(){
        Long a = this.tu,b = this.mau ;
        while(b!=0){
            Long r = a%b;
            a=b;b=r;
        }
        this.tu /=a;
        this.mau /=a;
    }
    public static J04014 tong(J04014 a , J04014 b ){
        a.rutgon();
        b.rutgon();
        J04014 newTong = new J04014();
        newTong.mau = a.mau * b.mau ;
        newTong.tu = a.mau * b.tu + a.tu * b.mau;
        newTong.rutgon();
        return newTong;
    }
    public static J04014 nhan(J04014 a , J04014 b ){
        a.rutgon();
        b.rutgon();
        J04014 newNhan = new J04014();
        newNhan.tu = a.tu * b.tu ;
        newNhan.mau = a.mau * b.mau ;
        newNhan.rutgon();
        return newNhan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long t = sc.nextLong();
        while( t-- > 0){
            Long a1 = sc.nextLong();
            Long b1 = sc.nextLong();
            Long a2 = sc.nextLong();
            Long b2 = sc.nextLong();
            J04014 a = new J04014(a1,b1);
            J04014 b = new J04014(a2,b2);
            J04014 ab= tong(a,b);
            J04014 nhan1= nhan(ab,ab);
            J04014 axb = nhan(a,b);
            J04014 axbxc = nhan(axb,nhan1);
            System.out.println(nhan1.tu+"/"+nhan1.mau+" "+ axbxc.tu+"/"+ axbxc.mau);
        }
    }
}
