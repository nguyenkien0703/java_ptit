package com.mycompany.bai1;

import java.util.Scanner;

public class J01008 {

    static void solve(long n ){
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                int cnt =0;
                while(n %i==0){
                    cnt+=1;
                    n/=i;
                }
                System.out.print(i +"("+cnt +") ");

            }
        }
        if (n > 1){
            System.out.println(n+"(1)");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =1;i<=t;i++){
//            System.out.print("Test "+ i+": ");
            long n = sc.nextLong();
            System.out.print("Test "+ i+": ");

            solve(n);
            System.out.println("");
        }
    }
    
}
