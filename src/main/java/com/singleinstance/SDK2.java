package com.singleinstance;

/**
 * Created by Think on 2017/3/18.
 */
public class SDK2 {
    private static Obj obj = null;

    private static Obj init(){
        System.out.println("come into init sdk2");
        Obj obj = new Obj();
        return obj;
    }

    private SDK2(){
        obj = init();
    }

    public static Obj getinstance(){
        System.out.println("come into getinstance!");
        if (  null == obj){
            System.out.println("come into getinstance! 2 level!!");
            synchronized (Obj.class) {
                if(null == obj)
                    obj = init();
                return obj;
            }
        }
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
