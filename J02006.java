/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author admin
 */
public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), m = sc.nextInt();
        TreeMap<Integer, Integer> a = new TreeMap<>();
        for(int i=0;i<n+m;i++){
            a.put(sc.nextInt(), 1);
        }
        Set<Map.Entry<Integer, Integer>> entry = a.entrySet();
        for(Map.Entry<Integer, Integer> x : entry){
            System.out.print(x.getKey()+" ");
        }
    }
}
