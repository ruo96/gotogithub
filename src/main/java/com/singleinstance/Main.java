package com.singleinstance;

public class Main {

    public static void main(String[] args) {

        SDK sdk = new SDK();
        Obj obj = sdk.init();
        sdk.setObj(obj);
        sdk.methodSDK();
        sdk.methodSDK2();
    }
}
