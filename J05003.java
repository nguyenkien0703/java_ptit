package com.mycompany.bai1;


import java.util.ArrayList;
import java.util.Scanner;

public class J05003

{
    static int cnt =0;
    private String ma, ten,lop,ns;private float diem ;

    public J05003(String ten, String lop, String ns, float diem) {
        if(cnt <10){
            this.ma="B20DCCN00"+ String.format("%d",cnt);
        }else if(cnt >=10 && cnt<=99){
            this.ma = "B20DCCN0"+ String.format("%d", cnt );
        }
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.diem = diem;
    }

    public J05003() {
        this.ma= this.lop= this.ns = this.ten="";
        this.diem=0f;
    }

    public void chuan(){
        String []a = this.ns.split("/");
        if(a[0].length()== 1) a[0]="0" + a[0];
        if(a[1].length()==1) a[1]="0"+a[1];

        this.ns=a[0]+"/"+a[1]+"/"+a[2];
    }
    @Override
    public String toString(){
        return this.ma + " "+ this.ten+" "+ this.lop +" "+ this.ns+ " "+ String.format("%.2f",this.diem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        ArrayList<J05003> a= new ArrayList<>();
        for(int i=0;i<n;i++){
            cnt++;
            String ten=sc.nextLine(), lop = sc.nextLine(),ns = sc.nextLine();
            float diem = sc.nextFloat();
            sc.nextLine();
            J05003 person = new J05003(ten,lop,ns,diem);

            person.chuan();
            a.add(person);
        }
        for(J05003 x : a ){
            System.out.println(x);
            System.out.println();
        }
    }
}
