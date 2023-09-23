package com.mycompany.bai1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer,Integer> a = new TreeMap<>();
        String  b ;
        while(sc.hasNext()) {
            b = sc.next();
            Integer kien =Integer.parseInt(b);
            if(a.containsKey(kien)) {
                int x = a.get(kien);
                a.put(kien, x +1);
            }else {
                a.put(kien,1);
            }
        }
        Set<Map.Entry<Integer, Integer>> huy = a.entrySet();
        for(Map.Entry<Integer,Integer> x : huy) {
            System.out.println(x.getKey()+" "+x.getValue());
        }



    }
}
