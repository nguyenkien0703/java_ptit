package com.mycompany.bai1.J07034;

public class MonHoc  implements Comparable<MonHoc>{
    private String ID;
    public String name, num ;

    public MonHoc(String ID, String name, String num) {
        this.ID = ID;
        this.name = name;
        this.num = num;
    }

    public MonHoc() {
    }
    @Override
    public String toString() {
        return ID +" " + name +" " + num;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.name.compareTo(o.name);
    }

}

