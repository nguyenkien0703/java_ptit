package com.mycompany.bai1;

import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream in = new FileInputStream("NHIPHAN.in");
        ObjectInputStream inputStream = new ObjectInputStream(in);
        ArrayList<String> list1 = (ArrayList<String>) inputStream.readObject();
        Scanner sc = new Scanner(new File("VANBAN.in"));;
        ArrayList<String> list2 = new ArrayList<>();
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        for(String x : list1) {
            set1.addAll(Arrays.asList(x.toLowerCase().trim().split("\\s+")));
        }

        while(sc.hasNext()) {
            String s = sc.nextLine().trim().toLowerCase();
            list2.addAll(Arrays.asList(s.split("\\s+")));

        }
        for(String i : list2) {
            if(!set2.contains(i) && set1.contains(i)) {
                System.out.println(i);
                set2.add(i);

            }
        }


    }
}
