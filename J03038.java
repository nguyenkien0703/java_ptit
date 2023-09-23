/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        TreeSet<Character> a = new TreeSet<>();
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i));
        }
        
        System.out.println(a.size());
    }
  
}
