package com.mycompany.bai1;

import java.util.*;
// chua ac
public class J07033 {
    static String chuan(String name ){
        String [] a = name.trim().replaceAll("\\s+"," ").toLowerCase().split("\\s+");
        String result = "";
        for(int i=0;i<a.length;i++){
            result += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1)+" ";
        }
        return result ;
//        System.out.println(result);
    }
    static class ob{
        String msv, full, lop, email;
        public ob(String code, String n, String l, String e){
            msv = code;
            full = chuan(n);
            lop = l ;
            email = e;
        }



        public boolean big(ob b){
            if(msv.compareTo(b.msv) > 0){
                return true;
            }else {
                return false;
            }
        }
        @Override
        public String toString (){
            return  msv +" " + full + lop +" " + email;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ob [] a = new ob[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
//            a.add(new ob(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine())) ;
            a[i] = new ob(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
//        System.out.println(111111111);
//        a.sort((ob x, ob y)-> {
//            if(x.msv.compareTo(y.msv) > 0) return 1 ;
//            else return -1;
//        });
        ob tmp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].big(a[j])){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
//        a.forEach(e -> System.out.println(e));
        for(int i=0;i<n;i++) System.out.println(a[i]);
    }



}

