package com.mycompany.bai1.J07010;



/**
 *
 * @author admin
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws ParseException, FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            System.out.println(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
    }
}