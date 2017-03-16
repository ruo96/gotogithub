package com.mytest;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class MethodA {
    public static void main(String[] args) {
        MethodB b = new MethodB();
        double d = b.getTime(new CallBackInterface() {
            @Override
            public void doSome() {

            }

            @Override
            public void executeMethod() {
                new MethodA().testMethod();
            }
        });
        System.out.println("d = " + d);
    }
    public void testMethod(){
        for (int i = 0; i < 10000; i++) {
            System.out.print("");
        }
    }
}
