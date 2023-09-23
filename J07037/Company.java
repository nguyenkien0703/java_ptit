package com.mycompany.bai1.J07037;

public class Company  implements Comparable<Company> {
    private String ma, desc, num ;

    public Company(String ma, String desc, String num) {
        this.ma = ma;
        this.desc = desc;
        this.num = num;
    }

    @Override
    public String toString() {
        return ma+" "+ desc+" "+ num;
    }

    @Override
    public int compareTo(Company o) {
        return this.ma.compareTo(o.ma);
    }
}
