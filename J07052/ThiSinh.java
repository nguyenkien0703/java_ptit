package com.mycompany.bai1.J07052;

public class ThiSinh  implements Comparable<ThiSinh>{
    private  String ID;
    private String ten, status;
    private float diem1,diem2,diem3,diemut,tongdiem;


    public ThiSinh(String ID, String ten, float diem1, float diem2, float diem3) {
        this.ID = ID;
        this.ten = ten;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        String kien= ID.substring(0,3);
        if(kien.equals("KV1")){
            this.diemut = 0.5F;
        }else if(kien.equals("KV2")){
            this.diemut = 1.0F;
        }else {
            this.diemut = 2.5F;
        }
        this.tongdiem = this.diem1 + this.diem2 + this.diem3 + this.diemut;
    }
    @Override
    public String toString (){
        return ID+" "+ ten +" " + diemut +" " + String.format("%.0f", tongdiem);
    }

    @Override
    public int compareTo(ThiSinh o) {
        return (int) (o.tongdiem - this.tongdiem);
    }
}
