package com.mycompany.bai1.J07059;

import java.util.Date;

public class Cathi  implements Comparable<Cathi> {
    private String ID,giothi,phongthi;
    private Date ngaythi;
    public static int cnt =1;
    public Cathi(Date ngaythi, String giothi, String phongthi) {
        this.ID = String.format("C%03d",cnt++);
        this.giothi = giothi;
        this.phongthi = phongthi;
        this.ngaythi = ngaythi;
    }
    @Override
    public String toString(){
        return ID+" "+ ngaythi+" "+ giothi+" "+ phongthi;
    }

    @Override
    public int compareTo(Cathi o) {
        if(this.ngaythi!= o.ngaythi) {
            return this.ngaythi.compareTo(o.ngaythi);
        }else if(this.ngaythi == o.ngaythi) {
            return this.giothi.compareTo(o.giothi);
        }else{
            return this.ID.compareTo(o.ID);
        }
    }
}
