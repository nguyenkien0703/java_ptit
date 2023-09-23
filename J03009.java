package com.mycompany.bai1;

import java.util.*;

public class J03009
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0 ){
            String s = sc.nextLine();
            String kien = sc.nextLine();
            String [] a= s.split("\\s+");
            TreeSet<String> l = new TreeSet<>();
            for(String x  : a ){
                l.add(x);
            }
            String [] b = kien.split("\\s+");
            TreeMap<String, Integer > mp = new TreeMap<>();
            for(String x : b ){
                mp.put(x,1);
            }
            for(String x : l ){
                if(!mp.containsKey(x)){
                    System.out.print(x+" ");
                }
            }
            System.out.println("");
            mp.clear();

            //            Set< Map.Entry<String,Integer>> entry = mp.entrySet();
//            for(Map.Entry<String, Integer> x : entry){
//                System.out.println(x.getKey() + " "+ x.getValue());
//            }
        }
    }
}
