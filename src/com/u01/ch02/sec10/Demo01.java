package com.u01.ch02.sec10;

import java.util.Scanner;

/**
 * ClassName: Demo01
 * Package: com.u01.ch02.sec10
 * Description:
 *
 * @author junbao3
 * Create 2024-10-12 14:10
 * @version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int i = sc.nextInt();
        System.out.println("输入的整数："+i);


        System.out.println("请输入小数：");
        double v = sc.nextDouble();
        System.out.println("输入的小数："+v);
    }
}
