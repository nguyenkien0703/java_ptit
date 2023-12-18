package com.mycompany.bai1;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class j07011 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("VANBAN.in"));
//        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        TreeMap<String, Integer> m = new TreeMap<>();
//        String re1 = "\\d+";
//        String re2 = "\\w+";
        int max = 0;
        while(sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            if(s.length() == 0) continue;

            String a[] = s.trim().split("[^a-z0-9]");

            for (String x : a) {

                if (x.length()>0) {
                    if (m.containsKey(x)) {
                        int fre = m.get(x);
                        m.put(x, fre + 1);
                        max = Math.max(fre + 1, max);
                    } else {
                        m.put(x, 1);
                        max = Math.max(max, 1);
                    }
                }
            }
        }
        while (max > 0) {
            for (Map.Entry<String, Integer> e : m.entrySet()) {
                if(e.getValue()==max) System.out.println(e.getKey() + " " + e.getValue());
            }
            max--;
        }
    }

}
