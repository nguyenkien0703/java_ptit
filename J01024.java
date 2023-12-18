package com.mycompany.bai1;

import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int ok =0;
            for (int i =0;i<s.length();i++){
                if(!(s.charAt(i) == '0'  || s.charAt(i) == '1' || s.charAt(i) =='2')){
                    ok =1;
                    System.out.println("NO");
                    break;
                }

            }
            if (ok==0) {

                System.out.println("YES");
            }
        }
    }
}
