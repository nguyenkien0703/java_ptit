package com.mycompany.bai1;

import java.util.Scanner;
import java.util.Vector;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s=s.toLowerCase() + " ";
            Vector<String > a = new Vector<>();
            String x = "";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    if(x!=""){
                        a.add(x);
                        x="";
                    }
                }else {
                    x+=s.charAt(i);
                }
            }
            String check ="";
            String first = a.get(0);
            for(int i=0;i<first.length();i++){
                check+= Character.toUpperCase(first.charAt(i));
            }
            for(int i=1;i<a.size();i++){
                String k = a.get(i);
                if(i!= a.size()-1){

                    System.out.print(k.substring(0,1).toUpperCase()+k.substring(1).toLowerCase()+" ");
                }else {
                    System.out.print(k.substring(0,1).toUpperCase()+k.substring(1).toLowerCase()+", ");

                }
            }
            System.out.print(check);
            System.out.println();
        }

    }
}
