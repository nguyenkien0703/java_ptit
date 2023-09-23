package com.mycompany.bai1;

import java.util.Scanner;
import java.util.TreeSet;

public class J04021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet1 s1 = new IntSet1(a);
        IntSet1 s2 = new IntSet1(b);
        IntSet1 s3 = s1.union(s2);
        System.out.println(s3);

    }


}
class IntSet1{
   private TreeSet<Integer> set;
   public IntSet1(){
       this.set = new TreeSet<>();
   }
   public IntSet1(int a[]){
       this.set = new TreeSet<>();
       for(int x : a ){
           this.set.add(x);
       }

   }
   public IntSet1 union(IntSet1 other){
       IntSet1 res = new IntSet1();
       for(int x : other.set){
           res.set.add(x);
       }
       for(int x : set ){
           res.set.add(x);
       }
       return res;
   }
   @Override
    public String toString(){
       String res = "";
       for(int x : this.set){
           res +=x+" ";
       }
       return  res;
   }

}