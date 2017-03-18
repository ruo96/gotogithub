package com.singleinstance;

public class Main2 {

    public static void main(String[] args) {

        Obj sdk = SDK2.getinstance();


//        Obj obj = sdk.init();
//        sdk.setObj(obj);
//        sdk.methodSDK();

        sdk.methodobj(); //此时为101
        Obj sdk2 = SDK2.getinstance();//如果是单例的话，那么就不会改变为1022
        sdk.methodshowobj();
        sdk2.methodshowobj();


    }
}
