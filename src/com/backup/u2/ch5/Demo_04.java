package com.backup.u2.ch5;

/**
 * ClassName: Demo_04
 * Package: com.u2.ch5
 * Description:
 *
 * @author junbao3
 * Create 2024-08-14 10:00
 * @version 1.0
 */
public class Demo_04 {
    public static void main(String[] args) {
        int num = 5;
        switch (num){
            case 1:
                System.out.println("第一季度");
                break;
            default:
                System.out.println("非法数字");
            case 2:
                System.out.println("第二季度");
                break;
            case 3:
                System.out.println("第三季度");
                break;
            case 4:
                System.out.println("第四季度");
                break;

        }
    }
}
