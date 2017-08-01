package com.runshunxu;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class SuperClass {

    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n) {
        System.out.println("SuperClass(int n)" + n);
        this.n = n;
    }

}
