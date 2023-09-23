package com.mycompany.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05042 {
    private  String ten;
    private int diem,submit;

    public J05042(String ten, int diem, int submit) {
        this.ten = ten;
        this.diem = diem;
        this.submit = submit;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        ArrayList<J05042> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            Integer diem = sc.nextInt();
            Integer submit = sc.nextInt();
            sc.nextLine();
            J05042 x = new J05042(s,diem, submit);
            a.add(x);
        }
        Collections.sort(a, new Comparator<J05042>() {
            @Override
            public int compare(J05042 o1, J05042 o2) {
                if(o1.diem > o2.diem){
                    return o1.diem - o2.diem;
                }else if(o1.diem == o2.diem){
                    return o1.submit - o2.submit;
                }else if(o1.diem == o2.diem && o1.submit == o2.submit){
                    return o1.ten.compareTo(o2.ten);
                }
                return 0;
            };
        });
        for(J05042 x : a ){
            System.out.println(x.ten+" "+x.diem+" "+x.submit);
        }





    }
}
