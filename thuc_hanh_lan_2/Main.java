package com.mycompany.bai1.thuc_hanh_lan_2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Double bonus(Double a, Double b) {
        if (a >= 8 && b >= 8) return 1.0;
        if (a >= 7.2 && b >= 7.2) return 0.5;
        return 0.0;
    }

    static class Person {
        String code, name, result;
        Double sum, plus;
        Long mark, age;

        public Person(int i, String name, String date, double a, double b) {
            this.code = "PH" + String.format("%02d", i);
            this.name = name;
            this.age = 2021 - Long.parseLong(date.split("/")[2]);
            this.plus = bonus(a, b);
            this.sum = (a + b) / 2 + this.plus;
            this.mark = Math.min(Math.round(this.sum), 10);
            if (this.mark < 5) this.result = "Truot";
            else if (this.mark < 7) this.result = "Trung binh";
            else if (this.mark == 7) this.result = "Kha";
            else if (this.mark == 8) this.result = "Gioi";
            else this.result = "Xuat sac";
        }

        public String toString() {
            return code + " " + name + " " + age + " " + mark + " " + result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            a.add(new Person(i + 1, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat()));
        }
        a.forEach(e -> System.out.println(e));
    }
}
