package com.mycompany.bai1;

import java.util.*;

public class J02025 {
    public static boolean nt(int n){
        if(n<2)return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0 ){
            int n = sc.nextInt();
            ArrayList<Integer> M = new ArrayList<>();
            for(int i=0;i<n;i++){
                M.add(sc.nextInt());
            }
            Collections.sort(M);
            Collections.reverse(M);
            int [] A = new int[n];
            Arrays.fill(A,0);

            while(true ){
                int a =0;
                for(int i=n-1;i>=0;i--){
                    if(A[i]==0){
                        ++a ;
                        A[i]=1;
                        for(int j=i+1;j<n;j++){
                            A[j]=0;
                        }
                        break;
                    }
                }
                if ( a== 0) break;
                int sum =0;
                for(int i=0;i<n;i++){
                    sum += A[i] * M.get(i);
                }
                if(nt(sum)== true ){

                    for(int i=0;i<n;i++){
                        if(A[i]==1){
                            System.out.print(M.get(i)+" ");
                        }
                    }
                    System.out.println("");

                }



            }







        }
    }
}
