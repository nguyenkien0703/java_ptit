package com.mycompany.bai1;

import java.util.Scanner;

public class J04007 {
    private String ten, gt, ns, dc,mst,nkhd;

    public J04007() {
    }

    public J04007(String ten, String gt, String ns, String dc, String mst, String nkhd) {

        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }
    public void chuanhoa(){
        String [] a = this.ns.split("/");
        if(a[0].length()==1){
            a[0]="0" + a[0];
        }
        if(a[1].length()==1){
            a[1]="0"+ a[1];
        }
        this.ns = a[0]+"/"+a[1]+"/"+a[2];
    }
    public void chuanhoa1(){
        String [] a = this.nkhd.split("/");
        if(a[0].length()==1){
            a[0]="0" + a[0];
        }
        if(a[1].length()==1){
            a[1]="0"+ a[1];
        }
        this.ns = a[0]+"/"+a[1]+"/"+a[2];
    }
    @Override
    public String toString(){
        return "00001 "+ this.ten + " "+this.gt+" "+ this.ns +" "+ this.dc + " "+ this.mst +" "+ this.nkhd;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine(), gt = sc.nextLine(), ns = sc.nextLine(), dc = sc.nextLine(), mst= sc.nextLine(), nkhd = sc.nextLine();
        J04007 person = new J04007(ten,gt,ns,dc,mst,nkhd);
//        person.chuanhoa();
//        person.chuanhoa1();
        System.out.println(person);
    }
}
