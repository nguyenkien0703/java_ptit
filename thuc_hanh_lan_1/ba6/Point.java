package com.mycompany.bai1.thuc_hanh_lan_1.ba6;

public class Point {

    private int x, y, dist;

    Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    Point(Point A)
    {
        this.x = A.x;
        this.y = A.y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }






}
