package com.myappsdkbluetooth;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class app {
    public static void main(String[] args) {
        sdk sd = new sdk();
        System.out.println("app---after sd is defined in app class");
        int num = sd.getNum(new myInterfaceCallback() {                                   //app调用sdk底层的getNum方法
            @Override
            public int callForNum(int i) {
                System.out.println("app---app get  i is :" + i);       //app实现了sdk提供的接口方法
                return i = i + 1;
            }
        });
        System.out.println("app---finally num is ; " + num);
    }
}
