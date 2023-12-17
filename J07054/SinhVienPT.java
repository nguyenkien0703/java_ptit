package com.mycompany.bai1.J07054;

public class SinhVienPT  {

    private String ten,ID,stt;
    private float d1,d2,d3,tb;
    public static int cnt =1;

    public SinhVienPT(String ten, float d1, float d2, float d3) {
        this.ID = String.format("SV%02d",cnt++);
        this.ten = ten;
        String [] a= ten.trim().replaceAll("\\s+"," ").toLowerCase().split("\\s+");
        this.ten="";
        for(String x : a){
            this.ten+= String.valueOf(x.charAt(0)).toUpperCase()+ x.substring(1)+" ";
        }
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tb= Math.round((d1+d2+d3)/3);
    }

    @Override
    public String toString(){
        return ID+" "+ ten+ tb+" "+stt;
    }
}
