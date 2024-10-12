package com.u01.ch02.sec10;

import java.util.Scanner;

/**
 * ClassName: Demo03
 * Package: com.u01.ch02.sec10
 * Description:
 *
 * @author junbao3
 * Create 2024-10-12 14:18
 * @version 1.0
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int i = sc.nextInt();
        System.out.println("输入的整数是："+i);

        sc.nextLine();

        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        System.out.println("输入的字符串是："+s);
    }
}
