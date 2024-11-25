package com.u01.ch09.sec01.demo04.v2;

/**
 * ClassName: InterfaceImpl
 * Package: com.u01.ch09.sec01.demo04.v2
 * Description:
 *
 * @author junbao3
 * Create 2024/11/26 6:54
 * @version 1.0
 */
public class InterfaceImpl implements InterfaceA{
    public static void show(){
        System.out.println("hello world11");
    }

    public static void main(String[] args) {
        show();
        InterfaceA.show();
    }
}
