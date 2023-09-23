package com.mycompany.bai1.J07048;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException {

        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<Product> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            a.add(new Product(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        for(Product x : a ){
            System.out.println(x);
        }



    }




}
