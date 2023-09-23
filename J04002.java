
package com.mycompany.bai1;

import java.util.Scanner;

public class J04002 {
    private  double width, height;
    private  static  String color;

    public J04002(){
    }
    public J04002 (double width, double height ,String color){
        this.width=width;
        this.height=height;
        this.color=color;
    }
    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width) {
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public static String getColor(){
        return  color;
    }
    public static void setColor(){
        J04002.color=color;
    }
    public double findArea(){
        return (this.width*this.height);
    }
    public double findPerimeter(){
        return 2*(this.width+this.height);
    }
    public  void ChuanHoa(){
        String kien = this.color;
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(kien.charAt(1)));
        for(int i=2;i<kien.length();i++){
            sb.append(Character.toLowerCase(kien.charAt(i)));
        }
        this.color =sb.toString();

    }

    @Override
    public String toString(){
        return String.format("%.0f",findPerimeter())+" "+String.format("%.0f",findArea())+" "+this.color;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n =sc.nextDouble();
        double m =sc.nextDouble();
        if(n<=0 || m<=0 ){
            System.out.println("INVALID");
            return ;
        }
        String s =sc.nextLine();
        J04002 x= new J04002(n,m,s);
        x.ChuanHoa();
        System.out.println(x);
    }

}