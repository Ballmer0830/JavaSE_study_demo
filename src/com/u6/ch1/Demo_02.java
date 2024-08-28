package com.u6.ch1;

import java.util.Arrays;

/**
 * ClassName: Demo_02
 * Package: com.u6.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-27 10:46
 * @version 1.0
 */
public class Demo_02 {
    public static void main(String[] args) {
        int[] arr = {9,1,3,8,7};
        //普通循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("============");
        //增强for
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("============");
    }
}
