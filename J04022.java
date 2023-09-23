package com.mycompany.bai1;

import java.util.*;

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
class WordSet{
    private TreeSet<String > set ;

    public WordSet(){
        this.set = new TreeSet<>();
    }
    public WordSet(String s  ){
        s = s.toLowerCase();
        String [] a = s.split("\\s+");
        this.set = new TreeSet<>();
        for(String x  : a ){
            this.set.add(x);
        }

    }


    public WordSet  union(WordSet other ){
        WordSet kien = new WordSet();
        for(String x : this.set ){
            kien.set.add(x);
        }
        for(String x : other.set){
            kien.set.add(x);
        }
        return kien ;
    }
    public WordSet intersection(WordSet other ){
        HashMap<String, Integer> map = new HashMap<>();

        for(String x : this.set ){
            map.put(x,1);
        }
        for(String x : other.set){
            if(map.containsKey(x)){
                map.put(x,2);
            }
        }
        WordSet res = new WordSet();
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for(Map.Entry<String, Integer> x : entry){
            if(x.getValue()==2){

                res.set.add(x.getKey());
            }
        }
        return res;
    }
    @Override
    public String toString(){
        String res="";
        for(String x : this.set){
            res +=x+" ";
        }
        return res;


    }

}
