package com.singleinstance;

/**
 * Created by Think on 2017/3/18.
 */
public class SDK3 {
    private static Obj obj = null;
    private static SDK3 sdk3 = null;

    private static Obj init(){
        System.out.println(" come into init!!!");
        Obj obj = new Obj();
        return obj;
    }

    private SDK3(){
        obj = init();
    }

    public static SDK3 getinstance(){
        System.out.println("sdk3 get instance !!!");
        if (  null == obj){
            System.out.println("sdk3 get instance level 2!!!");
            synchronized (Obj.class) {
                if(null == obj)
                    System.out.println("sdk3 get instance level 3!!!");
                    sdk3 = new SDK3();
                return sdk3;
            }
        }

    return sdk3;
    }


    public Obj getObj() {
        return obj;
    }

    public void setObj(Obj obj) {
        this.obj = obj;
    }

    public void methodSDK(){

        System.out.println("methodSDK--- ,the obj is :  " + obj + "objnum is :" + obj.objnum +"  hashcode is : " + obj.hashCode());
        obj.objnum = 102;
        System.out.println("methodSDK--- ,the obj is :" + obj +" objnum is :" + obj.objnum + "  hashcode is : " + obj.hashCode());
    }

    public void methodSDK2(){


        System.out.println("methodSDK2--- ,before changed objnum is : " + obj.objnum);

        obj.objnum = 104;
        System.out.println("methodSDK2--- ,after changed objnum is : " + obj.objnum +"the obj is :" + obj +"  hashcode is : " + obj.hashCode());
    }
}
