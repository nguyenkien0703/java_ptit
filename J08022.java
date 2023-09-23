package com.mycompany.bai1;

import java.util.Scanner;
import java.util.Stack;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0 ){
            int n = sc.nextInt();
            int [] a= new int [n+1];
            int [] b = new int [n+1];
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<n;i++){
                int x  = sc.nextInt();
                b[i]=x;
                if(st.empty()){
                    st.push(i);
                }else {
                    while(st.empty()== false && x > b[st.peek()]){
                        a[st.peek()] = x;
                        st.pop();
                    }
                    st.push(i);
                }
            }
            while(st.empty()== false){
                a[st.peek()]=-1;
                st.pop();
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();


        }
    }
}
