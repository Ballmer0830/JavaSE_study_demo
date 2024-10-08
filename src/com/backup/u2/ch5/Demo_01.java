package com.backup.u2.ch5;

/**
 * ClassName: Demo_01
 * Package: com.u2.ch5
 * Description:
 *
 * @author junbao3
 * Create 2024-08-13 15:54
 * @version 1.0
 */
public class Demo_01 {
    public static void main(String[] args) {
        int score = 66;
        String res = score >=60 ?"及格":"不及格";
        System.out.println(res);

        System.out.println("======================");

        int age = 1;
        String result = age >=18 ?"成年":"未成年";
        System.out.println(result);
    }
}
