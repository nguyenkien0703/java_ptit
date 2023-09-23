package com.mycompany.bai1;
import java.math.BigInteger;
import java.util.Scanner;

public class J03012 {
    // cộng hai số có thể có số 0 ở đầu, khi cộng lại có thể có số 0 ở đầu
    // thìu hãy loại bỏ số 0 đó

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
        sc.close();
    }
}