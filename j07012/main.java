package com.mycompany.bai1.j07012;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) inp.readObject();
        ArrayList<String> token = new ArrayList<>();
        for(String i : a ){
            String s = i.trim().replaceAll("\\s+"," ").toLowerCase();
            String tmp ="";
            for(int j=0;j<s.length();j++){
                if((s.charAt(j) <'a' || s.charAt(j) >'z') && (s.charAt(j) <'0' || s.charAt(j) >'9')){
                    tmp +=' ';
                }else {
                    tmp += s.charAt(j);
                }
            }
//            thay the tat ca các khoang trang trong chuoi bang 1 khoang trang

            tmp = tmp.trim().replaceAll("\\s+"," ");
            token.addAll(Arrays.asList(tmp.split(" ")));

        }

        TreeMap<String, Integer> myMap = new TreeMap<>();
        for(String i : token){
            if(myMap.containsKey(i)){
                int tmp = myMap.get(i);
                myMap.replace(i, tmp + 1);
            }else {
                myMap.put(i,1);
            }
        }
        ArrayList<Word> words = new ArrayList<>();
//         duyệt map và chỉ duyệt phần tử key của map thôi
        for(String i: myMap.keySet()){
            words.add(new Word(i,myMap.get(i)));
        }
        Collections.sort(words);
        for(Word i : words){
            System.out.println(i);
        }


    }


}


