package com.u2.ch6;

/**
 * ClassName: Demo_03
 * Package: com.u2.ch6
 * Description:
 *
 * @author junbao3
 * Create 2024-08-13 16:38
 * @version 1.0
 */
public class Demo_03 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
