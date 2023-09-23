package com.mycompany.bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J02026 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            ArrayList<Integer> M = new ArrayList<>();
            for(int i=0;i<n;i++){
                M.add(sc.nextInt());
            }
            Collections.sort(M);
            int [] A = new int[k+1];
            for(int i=1;i<=k;i++){
                A[i]=i;
            }
          while(true ){
              int cnt =0;
              for(int i=1;i<=k;i++){
                  System.out.print(M.get(A[i]-1)+" ");

              }
              System.out.println("");
              for(int i=k;i>0;i--){
                  if(A[i]!= n-k+i){
                      A[i]++;
                      cnt++;
                      for(int j=i+1;j<=k;j++){
                          A[j]= A[j-1] + 1;
                      }
                      break;

                  }
              }
              if(cnt ==0) break;
          }




        }
    }

}
