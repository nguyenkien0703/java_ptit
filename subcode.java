package com.mycompany.bai1;


import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
// kien
public class subcode {




    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
//        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            int [] b= new int[n+1];
            int [] a = new int[n+1];
            Stack<Integer> st =new Stack<>();
            for(int  i=0;i< n;i++){
                int x  = sc.nextInt();
                b[i] = x;
                if(st.empty()){
                    st.push(i);
                }else {
                    while(!st.empty() && x >b[st.peek()]) {
                        a[st.peek()] = x;
                        st.pop();
                    }
                    st.push(i);
                }
            }
            while (!st.empty()) {
                a[st.peek()] = -1;
                st.pop();
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");

            }
            System.out.println("");





        }







    }

}
