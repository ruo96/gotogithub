package com.myappsdkbluetooth;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class sdk {
        public int getNum(myInterfaceCallback callback){      //这个是sdk提供给app使用的方法
            int i = 1000;
            System.out.println("sdk---after i is defined!");
            i = callback.callForNum( i);    //回调，通知sdk可以来取i值了，i值已经得到了，然后随便app做什么都可以
            System.out.println("sdk---after callback  i is :" + i);
            i = i + 1;
            return i;
        }
}
