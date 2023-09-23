package com.mycompany.bai1;

import java.util.Scanner;

public class J04006
{
    private String ten, lop, ns;
    private double gpa;

    public J04006() {
        this.ten = this.ns =this.lop="";
        this.gpa =0;
    }

    public J04006(String ten, String lop, String ns, double gpa) {
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    public void chuanhoa(){
        StringBuilder nsc = new StringBuilder(this.ns);
        if(nsc.charAt(1)=='/'){
            nsc.insert(0,"0");
        }
        if(nsc.charAt(4)=='/'){
            nsc.insert(3,"0");
        }
        this.ns = nsc.toString();
    }
    @Override
    public String toString(){
        return "B20DCCN001"+" "+this.ten +" "+ this.lop +" "+this.ns +" "+String.format("%.2f", this.gpa);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine(), lop = sc.nextLine(), ns = sc.nextLine();
        double gpa = sc.nextDouble();
        J04006 person = new J04006(ten,lop,ns,gpa);
        person.chuanhoa();
        System.out.println(person);

    }
}
