package com.mycompany.bai1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//         đọc 10000 dongf, mỗi dòng chứa 1 số nguyên
        FileInputStream in = new FileInputStream("DATA.IN");
        DataInputStream sc = new DataInputStream(in);
        int [] f = new int [1005];
        for(int i=0;i<100000 ;i++) {
            f[sc.readInt()]++;
        }
        for(int i=0;i<=1000;i++) {
            if( f[i] > 0) {
                System.out.println(i + " " + f[i]);
            }
        }
              
         
        
    }
}
