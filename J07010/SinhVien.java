/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1.J07010;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author admin
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien
{
    private String ID;
    private String name;
    private String studentClass;
    private String birthday;
    private float GPA;
    private static int cnt = 1;

    public SinhVien(String name, String studentClass, String birthday, float GPA) throws ParseException
    {
        ID = String.format("B20DCCN%03d", cnt++);
        this.name = name;
//        cachs format nhanh ngày-tháng-năm về dd/mm/yyyy
        DateFormat date = new SimpleDateFormat("dd/mm/yyyy");
        this.studentClass = studentClass;
        this.birthday = date.format(date.parse(birthday));
        this.GPA = GPA;
    }

    @Override
    public String toString()
    {
        return ID + " " + name + " " + studentClass + " " + birthday + " " + String.format("%.2f", GPA);
    }
}