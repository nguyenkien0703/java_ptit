package com.mycompany.bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String > a = new ArrayList<>();
        String s ;
        while(sc.hasNext()) {
            s=sc.next();
            try{
                Integer.parseInt(s);
            }catch (Exception e ) {
                a.add(s);
            }

        }
        Collections.sort(a);
        for(String x : a ) {
            System.out.print(x+" ");
        }


    }
}
