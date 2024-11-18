package com.u01.ch09.sec01;

import static com.u01.ch09.sec01.InterfaceD.*;

/**
 * ClassName: InterfaceDImpl
 * Package: com.u01.ch09.sec01
 * Description:
 *
 * @author junbao3
 * Create 2024/11/19 7:00
 * @version 1.0
 */
public class InterfaceDImpl implements InterfaceD{
    public static void main(String[] args) {
        //可以使用接口直接调用 表面有static修饰
        System.out.println(a);

//        InterfaceD.a = 11;
//        a = 11;
    }
}
