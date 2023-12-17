package com.mycompany.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer > a = ((ArrayList<Integer>) inp.readObject());
        TreeMap<Integer, Integer> b = new TreeMap<>();
        for(Integer x : a ){
            if(!b.containsKey(x)){
                b.put(x,1);
            }else {
                int tmp = b.get(x);
                b.put(x,tmp + 1 );
            }

        }
        Set<Map.Entry<Integer,Integer>>  result  = b.entrySet();
        for(Map.Entry<Integer,Integer> x : result){
            System.out.println(x.getKey()+" " + x.getValue());
        }

    }
}
