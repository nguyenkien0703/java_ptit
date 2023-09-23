package com.mycompany.bai1;

import java.util.Scanner;

public class TuyenSinh {
    private  String maThiSinh,hoTen;
    private float d1,d2,d3,tong, dut;
    private  String ans ;

    public  TuyenSinh(String maThiSinh,String hoTen,float d1,float d2,float d3){
        this.maThiSinh=maThiSinh;
        this.hoTen=hoTen;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        tong =d1* 2+d2+d3;
        ans =maThiSinh.substring(0,3);

        if(ans.equals("KV1")){
            this.dut=0.5f;
        }else if(ans.equals("KV2")){
            this.dut=1f;
        }else if(ans.equals("KV3")) this.dut= 2.5f;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String ma=sc.nextLine();
        String ten= sc.nextLine();
        float a1=sc.nextFloat();
        float a2=sc.nextFloat();
        float a3=sc.nextFloat();
        TuyenSinh x= new TuyenSinh(ma,ten,a1,a2,a3);

        String res =x.maThiSinh+" "+x.hoTen+" ";
        double hoa = x.dut;
        if(hoa ==(int)hoa){
            res+=String.format("%.0f", hoa);
        }else {
            res += String.format("%.1f", hoa);
        }
        res+=" ";
        double kien=x.tong;
        if(kien==(int)kien){
            res+=String.format("%.0f",kien);
        }else {
            res+=String.format("%.1f",kien);
        }
        String chinh =res+" ";
        if((kien+ hoa)>=24){
            chinh+="TRUNG TUYEN\n";
        }else {
            chinh+="TRUOT\n";

        }
        System.out.println(chinh);
    }




}
