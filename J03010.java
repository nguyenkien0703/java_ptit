package com.mycompany.bai1;

import java.util.*;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        sc.nextLine();
        while( t-- > 0 )
        {
            String s = sc.nextLine();
            if(s.length()==0) continue;;
            s.trim();
            s= s.toLowerCase();
            String [] a= s.split("\\s+");
            String kien ="";
            kien += a[a.length-1 ];

            for(int i=0;i<a.length-1;i++){
                if(a[i].length()!=0){
                    String ll = a[i];
                    kien += ll.substring(0,1);

                }
            }
//            System.out.println(kien);

            if(mp.containsKey(kien)){
                int tansuat = mp.get(kien);
                ++tansuat;
                mp.put(kien, tansuat);
                kien +=String.valueOf(tansuat);
            }else {
                mp.put(kien, 1 );
            }

            kien +="@ptit.edu.vn";

            System.out.println(kien);
            kien ="";
        }
    }
}