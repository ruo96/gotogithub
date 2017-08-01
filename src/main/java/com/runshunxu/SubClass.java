package com.runshunxu;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class SubClass extends SuperClass{

    private int n;

    SubClass(){
        //super(300);
        System.out.println("SubClass");
    }

    public SubClass(int n){
        System.out.println("SubClass(int n):"+n);
        this.n = n;
    }

}
