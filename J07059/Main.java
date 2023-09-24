package com.mycompany.bai1.J07059;

import com.sun.security.jgss.GSSUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Cathi> a = new ArrayList<>();
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        while(n-- >0){
            a.add(new Cathi(date.parse(sc.nextLine()), sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a);
        for(Cathi x : a ){
            System.out.println(x);
        }
    }
}
