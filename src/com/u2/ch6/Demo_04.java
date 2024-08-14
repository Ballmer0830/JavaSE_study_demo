package com.u2.ch6;

/**
 * ClassName: Demo_04
 * Package: com.u2.ch6
 * Description:
 *
 * @author junbao3
 * Create 2024-08-13 16:43
 * @version 1.0
 */
public class Demo_04 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do{
            int a = 1;
            for (int j = 1; j <=i ; j++) {
                a=a*j;
            }
            System.out.println(a);
            sum+=a;
            i++;


        }while (i<=5);
        System.out.println("=============");
        System.out.println(sum);
    }
}
