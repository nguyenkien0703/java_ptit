package com.mycompany.bai1.J07017;

public class Pair<T1,T2> {
    private T1 t1;
    public T2 t2;

    public Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public static  boolean check(int n ){
        if(n< 2) return  false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean isPrime() {
        return  check((Integer) this.getT1())== true && check((Integer)this.getT2()) == true;
    }
    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
    @Override
    public String toString() {
//        %s là giá trị cảu 1 chuỗi
        return String.format("%s %s", this.getT1(), this.getT2());

    }
}
