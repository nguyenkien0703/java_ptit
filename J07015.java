package com.mycompany.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class J07015 {
    public static boolean nt(int n){
        if(n<2)return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)return false;
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // doc 1 doi tuong or 1 object trong 1 file nhi phan
//         có thể là 1 object or là 1 ArrayList
        FileInputStream inputStream= new FileInputStream("SONGUYEN.in");
        ObjectInputStream in   = new ObjectInputStream(inputStream);
        ArrayList<Integer> list =(ArrayList<Integer>) in.readObject();
        int [] f = new int [10005];
        for(int i : list) {
            if(nt(i)== true){
                f[i]++;
            }
        }
        for(int i=2;i<=10000;i++){
            if(f[i]>0){
                System.out.println(i+" "+f[i]);
            }
        }
        in.close();
        inputStream.close();

    }
}
