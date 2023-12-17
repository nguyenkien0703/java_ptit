package com.mycompany.bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07072 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> a= new ArrayList<>();
        String s ;
        while(true){
            s = sc.nextLine();
            a.add(s.trim().replace("\\s+"," ").toLowerCase());
        }
    }
}
