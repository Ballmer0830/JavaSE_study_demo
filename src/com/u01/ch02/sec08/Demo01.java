package com.u01.ch02.sec08;

/**
 * ClassName: Demo01
 * Package: com.u01.ch02.sec08
 * Description:
 *
 * @author junbao3
 * Create 2024-10-12 10:43
 * @version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        byte b1 = 1;

        //编译通过
        byte result2 = 120 + 7;
        System.out.println(result2);

//        //编译报错，128超出byte范围
//        byte result3 = 120 + 8;
//        System.out.println(result3);
//
//        //编译报错，b为变量，不触发常量优化机制，且int类型以下的数据运算会转化为int类型
//        byte b = 120;
//        byte result4 = b + 7;
//        System.out.println(result4);
//
//        //编译报错，理由同上
//        byte a = 7;
//        byte b2 = 120;
//        byte result5 = a + b2;
//        System.out.println(result5);
    }
}
