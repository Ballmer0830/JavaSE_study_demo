package com.u01.ch09.sec01.demo03.v03;

/**
 * ClassName: InterfaceImpl
 * Package: com.u01.ch09.sec01.demo02.v04
 * Description:
 *
 * @author junbao3
 * Create 2024/11/26 6:29
 * @version 1.0
 */
public class InterfaceImpl implements InterfaceA, InterfaceB {
    @Override
    public void print(String info) {
        InterfaceA.super.print(info);
    }
}
