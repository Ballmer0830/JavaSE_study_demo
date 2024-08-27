package com.u5.ch4;

/**
 * ClassName: InterfaceDemo
 * Package: com.u5.ch4
 * Description:
 *
 * @author junbao3
 * Create 2024-08-27 8:45
 * @version 1.0
 */
public interface InterfaceDemo_01 {
    public abstract void method1();

    void method2();

    public default void method3(){
        System.out.println("接口的默认方法");
    }

    public default void method5(){
        System.out.println("接口的默认方法");
    }

    public static void method4(){
        System.out.println("接口的静态方法");
    }
    public static void method6(){
        System.out.println("接口的静态方法");
    }
}
