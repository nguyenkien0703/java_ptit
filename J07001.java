package com.mycompany.bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// ReadFile: Scanner, FileRead
//WriteFile: PrintWriter, FileWriter
public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(s);

        }

    }
}
