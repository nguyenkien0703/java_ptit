package com.mycompany.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05054 {
    static int cnt =0;
    private String ten, ma, status ;
    private float diem, stt ;

    public J05054(String ten, float diem) {
        if(cnt <10){
            this.ma = "HS0"+ String.format("%d", cnt );
        }else {
            this.ma = "HS"+ String.format("%d", cnt );
        }
        this.ten = ten;
        this.diem = diem;
        if(this.diem< 5 ){
            this.status="Yeu";
        }else if(this.diem >=5 && this.diem <7){
            this.status= "Trung Binh";
        }else if(this.diem >=7 && this.diem <= 9 ){
            this.status= "Kha";
        }else{
            this.status="Gioi";
        }

    }

    public J05054() {
    }
    @Override
     public String toString(){
        return this.ma +" "+ this.ten +" "+ this.diem +" "+ this.status + this.stt;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<J05054> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten = sc.nextLine();
            float diem = sc.nextFloat();
            a.add(new J05054(ten,diem));

        }
        for(J05054 x : a ){
            
        }




    }

}
