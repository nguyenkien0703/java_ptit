package com.mycompany.bai1.J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String data, name ;

    public LoaiPhong(String total) {
        data = total;
        String [] a = total.split("\\s+");
        this.name = a[1];


    }


    @Override
    public String toString() {
        return data;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }
}
