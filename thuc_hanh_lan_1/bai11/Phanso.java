package com.mycompany.bai1.thuc_hanh_lan_1.bai11;

public class Phanso {
    private long tu, mau;

    static long gcd(long a, long b ){
        if(b==0){
            return a ;
        }else {
            return gcd(b,a%b);
        }
    }
    public void rutgon(){
        long gcd = gcd(this.tu, this.mau);
        this.tu/=gcd;
        this.mau/=gcd;

    }


    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    public Phanso(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
}
