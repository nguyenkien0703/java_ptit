package com.mycompany.bai1;

import java.util.Scanner;
import java.util.Stack;

public class J03017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long t = sc.nextLong();;
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            Long  res = 0L, tmp =0L;
            for(int  i=0;i<s.length();i++){
                if(st.size()<2) st.push(i);
                else{
                    if(s.charAt(i) == '0' && s.charAt(st.lastElement()) == '0' && s.charAt(st.elementAt(st.size() - 2)) == '1'){
                        st.pop();
                        st.pop();
                    }else st.push(i);
                }

                tmp = Long.valueOf(st.elementAt(st.size()-1));
                res = Math.max(res, i - tmp);
            }
            System.out.println(res);
        }
    }
}
