package com.singleinstance;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("before sdk3 get instance!");
       SDK3 sdk3 = SDK3.getinstance();


//        Obj obj = sdk.init();
//        sdk.setObj(obj);
//        sdk.methodSDK();
        sdk3.methodSDK();
        sdk3.methodSDK2();
        System.out.println("=====================================================================");
        System.out.println("before sdk4 get instance!");
        SDK3 sdk4 = SDK3.getinstance();
        sdk4.methodSDK();
        sdk4.methodSDK2();

//        sdk.methodobj(); //此时为101
//        Obj sdk2 = SDK2.getinstance();//如果是单例的话，那么就不会改变为1022
//        sdk.methodshowobj();
//        sdk2.methodshowobj();


    }
}
