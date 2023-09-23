package com.mycompany.bai1;


import java.util.Scanner;

public class J04012 {
    private String ma, ht, cv;
    private int snc,pc,tt, luong,lcb;
    public static int cnt =0;

    public J04012( String ht, int  lcb,  int snc,String cv) {
        this.ht = ht;
        this.lcb = lcb;
        this.cv = cv;
        this.snc = snc;
    }
    public void calc(){
        if( cnt <10){
            this.ma="NV0"+ String.format("%d", cnt);
        }else {
            this.ma= "NV" + String.format("%d", cnt);
        }

        if(this.cv.equals("GD")){
            this.pc = 250000;
        }else if(this.cv.equals("PGD")){
            this.pc = 200000;
        }else if(this.cv.equals("TP")){
            this.pc = 180000;
        }else {
            this.pc = 150000;
        }
        this.luong= this.lcb * this.snc;

        if(this.snc>=25){
            this.tt= this.luong * 20 /100;
        }else if(this.snc >=22 && this.snc <= 24){
            this.tt = this.luong * 10 /100;
        }


    }
    @Override
    public String toString(){
        return this.ma + " "+ this.ht+" "+ this.luong +" "+ this.tt +" "+ this.pc +" "+ String.format("%d",this.luong+this.tt+this.pc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ht= sc.nextLine();
        int lcb = sc.nextInt();
        int snc = sc.nextInt();
        sc.nextLine();
        String cv = sc.nextLine();
        cnt +=1;
        J04012 person = new J04012(ht, lcb,snc,cv);
        person.calc();
        System.out.println(person);
    }
}
