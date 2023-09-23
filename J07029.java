package com.mycompany.bai1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07029 {
    static boolean check(int n ) {
        if(n< 2 ) return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) return  false;
        }
        return  true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("DATA.in");
        ObjectInputStream in = new ObjectInputStream(inputStream);

        ArrayList<Integer> a =(ArrayList<Integer>) in.readObject();
        ArrayList<Integer> prime = new ArrayList<>();
        Integer kien ;
        int [] f = new int [1000005];
        for(Integer x : a  ){
            if(check(x)){
                if(f[x]==0) {
                    prime.add(x);
                }
                f[x]++;
            }
        }

//sap xep xong dao chieu luon
        Collections.sort(prime, Collections.reverseOrder());
        for(int i=0;i<10;i++){
            System.out.println(prime.get(i)+" "+ f[prime.get(i)]);
        }

    }
}
