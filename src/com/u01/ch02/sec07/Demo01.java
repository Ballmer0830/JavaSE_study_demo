package com.u01.ch02.sec07;

/**
 * ClassName: Demo01
 * Package: com.u01.ch02.sec07
 * Description: 隐式转换 特殊情况
 *
 * @author junbao3
 * Create 2024-10-11 16:03
 * @version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        byte b = 1;
        char ch = 'a';

        // byte short char 只要参加运算 就会先转成int  再运算
        int i = b + ch;
        System.out.println(i);


        //byte 先变成int 因为要和double运算 还要转成double 再运算
        double d = 1.0;
        double v = ch + d;
        System.out.println(v);

    }
}
