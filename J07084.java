package com.mycompany.bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J07084 {
    static class ob {
        String full, start, end ;
        long total;
        public ob(String n, String s, String e) {
            full = n;
            start = s;
            end = e;
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
            try{
//                getTime la lay ra miligiay
                total = f.parse(end).getTime()- f.parse(start).getTime();
            }catch(ParseException ex){
            }
        }
        @Override
        public String toString(){
            return full + " "+ total/60000;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
            Scanner sc= new Scanner(new File("ONLINE.in"));
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(new ob(sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        a.sort((ob x, ob y)-> {
            if(x.total == y.total) return x.full.compareTo(y.full);
            return y.total > x.total ? 1 : -1;
        });
        a.forEach(e -> System.out.println(e));



    }






}
