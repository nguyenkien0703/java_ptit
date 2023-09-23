package com.mycompany.bai1.J07048;

public class Product implements Comparable<Product>{
    private String ID, name;
    private int price, guarantee;





    public Product(String ID, String name, int price, int guarantee) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.guarantee = guarantee;
    }
    @Override
    public String toString()
    {
        return ID + " " + name + " " + price + " " + guarantee;
    }

    @Override
    public int compareTo(Product o) {
//      sap xep giam dan thi lay cai sau tru di cai trc, duoi day dan la sap xep giam dan
        //con tang dan la lay cai truoc tru di cai sau
       if(this.price!= o.price){
           return o.price - this.price;
       }else {
           return this.ID.compareTo(o.ID);
       }
    }
}
