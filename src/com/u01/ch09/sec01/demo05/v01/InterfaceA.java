package com.u01.ch09.sec01.demo05.v01;

/**
 * ClassName: InterfaceA
 * Package: com.u01.ch09.sec01.demo05
 * Description:
 *
 * @author junbao3
 * Create 2024/11/26 7:06
 * @version 1.0
 */
public interface InterfaceA {
    default void show(){
        System.out.println("接口");
    }
}
