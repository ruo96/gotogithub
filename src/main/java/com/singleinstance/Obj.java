package com.singleinstance;

/**
 * Created by Think on 2017/3/18.
 */
public class Obj {
    public static int objnum;

    Obj(){
        this.objnum = 1022;
    }

    public void methodobj(){
        System.out.println("this is in obj method");
        objnum = 101;
        System.out.println("in objmethod ,obj is : " + objnum);
    }
    public void methodshowobj(){
        System.out.println("finally objnum is : " + objnum + "hashcode" + this.getClass().hashCode() + "  class : " + this .getClass().getName());
    }
}
