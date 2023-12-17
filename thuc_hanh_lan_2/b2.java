package com.mycompany.bai1.thuc_hanh_lan_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class b2 {
    static class ob {
        String code, name, type, start, end, total;
        Long time, h, m, s, age, check, fin;
        int rank;

        static long check(long age) {
            if (age < 18) return 0;
            if (age < 25) return 1;
            if (age < 32) return 2;
            return 3;
        }

        static String convert(long secs) {
            long h = secs / 3600;
            long m = (secs - h * 3600) / 60;
            long s = secs - h * 3600 - m * 60;
            return String.format("%02d:%02d:%02d", h, m, s);
        }

        public ob(int i, String name, String date, String start, String end) {
            this.code = "VDV" + String.format("%02d", i);
            this.name = name;
            this.age = 2021 - Long.parseLong(date.split("/")[2]);
            this.start = start;
            this.end = end;
            SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
            try {
                this.time = (f.parse(end).getTime() - f.parse(start).getTime()) / 1000;

            } catch (ParseException e) {

            }
            this.check = check(this.age);
            this.fin = this.time - this.check;
        }

        public String toString() {
            return code + " " + name + " " + convert(time) + " " + convert(check) + ' ' + convert(fin) + " " + this.rank;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ob> a = new ArrayList<>();
        ArrayList<ob> b = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            ob x = new ob(i+1, sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(x);
            b.add(x);
        }
        b.sort((ob x, ob y)-> x.fin.compareTo(y.fin));
        a.forEach(e-> {
            for(int i=0;i<n;i++){
                if(b.get(i).fin.compareTo(e.fin)==0){
                    e.rank = i+1;
                    break;
                }
            }
            System.out.println(e);
        });
    }

}
