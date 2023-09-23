package com.mycompany.bai1.J07046;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList<Phong> a =  new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        while(t-- > 0) {
            a.add(new Phong(sc.nextLine(),sc.nextLine(),date.parse(sc.nextLine()), date.parse(sc.nextLine())));
        }
        Collections.sort(a);
        for(Phong x : a ){
            System.out.println(x);
        }



    }
}
