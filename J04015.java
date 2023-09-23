package com.mycompany.bai1;

import java.util.Scanner;

public class J04015 {
    private String ma, ten;
    private Long lcb , pc,bac, luong;

    public J04015(String ma, String ten, Long lcb) {
        this.ma = ma;
        this.ten = ten;
        this.lcb = lcb;
    }
    public void calc(){
        String first = this.ma;
        String first1 = first.substring(0,2);
        String first2= first.substring(2, 2 + 2 );
        if(first1.equals("HT")){
            this.pc= 2000000L;
        }else if(first1.equals("HP")){
            this.pc= 900000L;
        }else{
            this.pc= 500000L;
        }
        Long bac1 = 0L;
        for(int i=0;i<first2.length();i++){
            bac1= bac1 * 10 +( first2.charAt(i)-'0');
        }
        this.bac = bac1;
        this.luong = this.lcb * this.bac + this.pc;
    }
    @Override
    public String toString(){
        return this.ma+" "+this.ten +" "+ this.bac +" "+ this.pc +" "+ this.luong;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma= sc.nextLine(), ten = sc.nextLine();
        Long lcb = sc.nextLong();
        J04015 person = new J04015(ma,ten,lcb);
        person.calc();
        System.out.println(person);
    }
}
