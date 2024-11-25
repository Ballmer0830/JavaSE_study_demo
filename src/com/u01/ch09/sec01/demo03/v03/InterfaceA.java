package com.u01.ch09.sec01.demo03.v03;

/**
 * ClassName: InterfaceA
 * Package: com.u01.ch09.sec01
 * Description:
 *
 * @author junbao3
 * Create 2024/11/19 6:10
 * @version 1.0
 */
public interface InterfaceA {
    public default void print(String info){
        System.out.println(info);
    }
}
