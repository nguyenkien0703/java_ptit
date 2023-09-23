package com.mycompany.bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class J07009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
class IntSet{
    private TreeSet<Integer> set;
    public IntSet(){
        this.set = new TreeSet<>();
    }
    public IntSet(int a[]){
        this.set = new TreeSet<>();
        for(int x : a ){
            this.set.add(x);
        }
    }
    public IntSet intersection(IntSet other){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : this.set){
            map.put(x,1);
        }
        for(int x : other.set){
            if(map.containsKey(x)){
                map.put(x,2);
            }
        }
        IntSet res = new IntSet();
        Set<Map.Entry<Integer,Integer>> entry = map.entrySet();
        for(Map.Entry<Integer,Integer> x : entry){
            if(x.getValue() == 2){
                res.set.add(x.getKey());
            }
        }
        return res;
    }

    @Override
    public String toString (){
        String res = "";
        for(int x : this.set){
            res += x+" ";
        }
        return res;
    }
}
