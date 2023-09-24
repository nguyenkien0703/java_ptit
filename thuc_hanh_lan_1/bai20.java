package com.mycompany.bai1.thuc_hanh_lan_1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair<Integer,Integer>> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new Pair<>(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.first() - o2.first() ;
            }
        });
        int result = a.get(0).first() + a.get(0).second();
        for(int i=1;i<n;i++){
            result = Math.max(result, a.get(i).first()) + a.get(i).second();
        }
        System.out.println(result);
    }
}
class Pair<T1, T2> {
    private T1 t1;
    private T2 t2;

    public Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 first() {
        return t1;
    }

    public T2 second() {
        return t2;
    }

}
