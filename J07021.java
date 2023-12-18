package com.mycompany.bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
//        đọc dữ liệu tuwf file, só dòng khong biết trước,
        String s ;
        while (sc.hasNext()) {
            s=sc.nextLine().toLowerCase().trim();
            String [] a =  s.replaceAll("\\s+"," ").split("\\s+");
            if(a[0].compareTo("end")==0){
                break;
            }
            for(String i : a ){
                System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1)+" ");
            }
            System.out.println();
        }



    }
}
