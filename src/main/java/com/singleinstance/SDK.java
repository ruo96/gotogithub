package com.singleinstance;

/**
 * Created by Think on 2017/3/18.
 */
public class SDK {
    public  Obj obj;

    public Obj init(){
        Obj obj = new Obj();
        return obj;
    }

    public Obj getObj() {
        return obj;
    }

    public void setObj(Obj obj) {
        this.obj = obj;
    }

    public void methodSDK(){
        obj.objnum = 102;
        System.out.println("in sdk method1 ,the obj is :" + obj +"  hashcode is : " + obj.hashCode());
    }

    public void methodSDK2(){
        System.out.println("now in methodSDK2 ,objnum is : " + obj.objnum);
        System.out.println("in sdk method1 ,the obj is :" + obj +"  hashcode is : " + obj.hashCode());
    }
}
