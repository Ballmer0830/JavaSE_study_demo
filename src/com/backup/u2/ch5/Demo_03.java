package com.backup.u2.ch5;

/**
 * ClassName: Demo_03
 * Package: com.u2.ch5
 * Description:
 *
 * @author junbao3
 * Create 2024-08-13 16:08
 * @version 1.0
 */
public class Demo_03 {
    public static void main(String[] args) {
        int num = 15;
        switch(num){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("非法数字");
//                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
        }
    }
}
