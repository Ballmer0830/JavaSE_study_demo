package com.demo;

/**
 * ClassName: Demo_01
 * Package: com.demo
 * Description: "\t"  和  '\t'
 *
 * @author junbao3
 * Create 2024-08-28 11:00
 * @version 1.0
 */
public class Demo_01 {
    public static void main(String[] args) {
        //效果一样
        System.out.println("双引号杠t："+"\t"+1);
        System.out.println("单引号杠t："+'\t'+1);

        System.out.println(1+'\t'+3);//13
        System.out.println(1+"\t"+3);//1	3

        char t = '\t';
        System.out.println(1+t+3);//13


    }
}
