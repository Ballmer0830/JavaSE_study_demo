package com.backup.u4.ch4;

/**
 * ClassName: Demo_01
 * Package: com.u4.ch4
 * Description:
 *
 * @author junbao3
 * Create 2024-08-21 15:31
 * @version 1.0
 */
public class Demo_01 {
    final String str= "";
    public static void main(String[] args) {
        Demo_01 demo01 = new Demo_01();
        demo01.add(1,2);
        demo01.add(1,2,3);
        final Animal animal = new Animal();
//        animal = null;

//        demo01.str = "111";
    }

    public final int add(int a,int b){
        return a+b;
    }
    public final int add(int a,int b,int c){
        return a+b+c;
    }
}

class Animal{

}