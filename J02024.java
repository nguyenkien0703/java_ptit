package com.mycompany.bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J02024 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> M = new ArrayList<>();
            for(int i=0;i<n;i++){
                M.add(sc.nextInt());
            }
            Collections.sort(M);
            Collections.reverse(M);
            int [] A= new int[n];
            Arrays.fill(A,0);
            while(true ){
                int a =0;
                for(int i=n-1;i>=0;i--){
                    if(A[i]==0){
                        ++a;
                        A[i]=1;
                        for(int j= i+1;j<n;j++){
                            A[j]=0;
                        }
                        break;
                    }
                }
                if( a==0) break;
                int sum =0;
                for(int i=0;i<n;i++){
                    sum += A[i]* M.get(i);
                }
                if(sum%2==1){
                    for(int i=0;i<n;i++){
                        if(A[i]==1)
                            System.out.print(M.get(i)+" ");
                    }
                    System.out.println();
                }
            }

        }

    }
}
