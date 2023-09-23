package com.mycompany.bai1;

import java.util.*;

public class J03027
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack st = new Stack();
        for(int i = s.length() - 1; i >= 0; --i){
            if(!st.empty() && s.charAt(i) ==(char) st.peek()){
                st.pop();
            }else {
                st.push(s.charAt(i));
            }
        }
        if(st.empty()){
            System.out.println("Empty String");
        }else {
            while(!st.isEmpty()){
                System.out.print(st.pop());
            }
        }
    }
}