package com.u01.ch09.sec01;

/**
 * ClassName: InterfaceAImpl
 * Package: com.u01.ch09.sec01
 * Description:
 *
 * @author junbao3
 * Create 2024/11/19 6:11
 * @version 1.0
 */
public class InterfaceAImpl implements InterfaceA {
    @Override
    public void print(String info) {
        System.out.println(info);
    }

    @Override
    public void add(int a) {

    }

    @Override
    public String merge(String info, int a) {
        return null;
    }
}
