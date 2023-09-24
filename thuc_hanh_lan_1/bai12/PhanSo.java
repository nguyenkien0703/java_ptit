package com.mycompany.bai1.thuc_hanh_lan_1.bai12;

public class PhanSo {
    private long tu,mau;

    static long gcd(long tu, long mau){
        if(mau==0){
            return tu;
        }else{
            return gcd(mau,tu%mau);
        }

    }
    public void rg(){
        long GCD= gcd(this.tu,this.mau);
        this.tu/=GCD;
        this.mau/=GCD;
    }
    public void add(PhanSo A) {
        long LCM = this.mau * A.mau /gcd(A.mau, this.mau);
        this.tu*= LCM/this.mau;
        A.tu *= LCM/A.mau;
        this.mau=LCM;
        this.tu+=A.tu;
        this.rg();
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

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
}
