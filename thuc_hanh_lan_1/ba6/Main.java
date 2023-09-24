package com.mycompany.bai1.thuc_hanh_lan_1.ba6;

import java.util.Scanner;

public class Main {
    public static double distanceX(Point A, Point B)
    {
        return Math.sqrt((A.getX() - B.getX()) * (A.getX() - B.getX()) );
    }
    public static double distanceY(Point A, Point B)
    {
        return Math.sqrt((A.getY() - B.getY()) * (A.getY() - B.getY()) );
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point A= new Point(sc.nextInt(),sc.nextInt());
        Point B = new Point(sc.nextInt(),sc.nextInt());
        Point C= new Point(sc.nextInt(),sc.nextInt());
        Point D= new Point(sc.nextInt(),sc.nextInt());

        Double AB = distanceX(A,B), AC= distanceX(A,C), AD=distanceX(A,D),BC=distanceX(B,C),BD=distanceX(B,D),CD=distanceX(C,D);
        Double AB1 = distanceY(A,B), AC1= distanceY(A,C), AD1=distanceY(A,D),BC1=distanceY(B,C),BD1=distanceY(B,D),CD1=distanceY(C,D);
        AB= Math.max(AB,AC);
        AB=Math.max(AB,AD);
        AB=Math.max(AB,BC);
        AB=Math.max(AB,BD);
        AB=Math.max(AB,CD);

        AB1= Math.max(AB1,AC1);
        AB1=Math.max(AB1,AD1);
        AB1=Math.max(AB1,BC1);
        AB1=Math.max(AB1,BD1);
        AB1=Math.max(AB1,CD1);
        double resutl = Math.max(AB,AB1);
        System.out.println(String.format("%.0f",resutl *resutl));
    }


}
