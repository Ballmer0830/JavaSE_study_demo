package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: Demo03
 * Package: com.demo
 * Description:
 *
 * @author junbao3
 * Create 2024/10/17 11:18
 * @version 1.0
 */

public class Demo_03 {
    List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到信息管理系统");
        while (true){
            System.out.println("请选择操作：1 新增  2 查询 3 退出");
            String choice  = scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println("请输入字符串：");
                    String info = scanner.nextLine();
                    add(info);
                    System.out.println("添加成功");
                    break;
                case "2":
                    List<String> infos = get();
                    System.out.println("********");
                    for (String s : infos) {
                        System.out.println(s);
                    }
                    System.out.println("********");
                    break;
                case "3":
                    System.out.println("再见");
                    return;
                default:
                    System.out.println("输入有误");
            }
        }
    }

    private static List<String> get() {
        return new Demo_03().list;

    }

    private static void add(String info) {
        new Demo_03().list.add(info);
    }
}
