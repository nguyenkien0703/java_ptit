package com.mycompany.bai1.J07046;

import java.util.Date;

public class Phong  implements Comparable<Phong> {
   private String ID;
   private String name, roomID;
   private Date startTime, endTime;
   private long daysOfStay;
    public static int cnt =1;

    public Phong(String name, String roomID, Date startTime, Date endTime) {
        this.ID = String.format("KH%02d",cnt++);
        this.name = name;
        this.roomID = roomID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.daysOfStay = (endTime.getTime()-startTime.getTime())/(1000l * 60 * 60 * 24);

    }

    @Override
    public String toString() {
        return ID + " " + name + " " + roomID + " " + daysOfStay;
    }

    @Override
    public int compareTo(Phong o) {
        return (int) (o.daysOfStay - this.daysOfStay);


    }
}
