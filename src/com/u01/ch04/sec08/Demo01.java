package com.u01.ch04.sec08;

import java.util.Arrays;

/**
 * ClassName: Demo01
 * Package: com.u01.ch04.sec08
 * Description: 数组反转
 *
 * @author junbao3
 * Create 2024-10-14 14:50
 * @version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};

        System.out.println(Arrays.toString(arr));
//        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

        //两个数值交换 可以使用异或
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }

        System.out.println(Arrays.toString(arr));
    }
}
