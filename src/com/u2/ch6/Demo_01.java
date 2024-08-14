package com.u2.ch6;

/**
 * ClassName: Demo_01
 * Package: com.u2.ch6
 * Description:
 *
 * @author junbao3
 * Create 2024-08-13 16:25
 * @version 1.0
 */
public class Demo_01 {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 && i%5!=0){
                count++;
                num++;
                if (num>5){
                    System.out.println();
                    num = 1;
                }
                System.out.print(i+"\t");
            }
        }
        System.out.println();
        System.out.println("=============");
        System.out.println(count);

        System.out.println("老师的写法");

        int count1 = 0;
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 && i%5!=0){
                count1++;
                System.out.print(i+"\t");
                if (count1%5==0){
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("=============");
        System.out.println(count1);
    }
}
