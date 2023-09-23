package com.mycompany.bai1;

import java.util.Scanner;

public class J04005 {
    private String ten,ns;
    private double a,b,c;

    public J04005() {
    }

    public J04005(String ten, String ns, double a, double b, double c) {
        this.ten = ten;
        this.ns = ns;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void CH(){
        StringBuilder sb = new StringBuilder("");
        String [] a= this.ten.split("\\s+");
        for(String x : a ){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1;i<x.length();i++){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        this.ten = sb.toString();
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
        return this.ten + " "+ this.ns +" "+ String.format("%.1f", this.a + this.b + this.c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ns = sc.nextLine();
        Double a= sc.nextDouble(), b= sc.nextDouble(), c= sc.nextDouble();
        J04005 person = new J04005(ten,ns,a,b,c);
        person.CH();
        System.out.println(person);
    }
}
