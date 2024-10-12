package com.backup.u6.ch1;

import java.util.Arrays;

/**
 * ClassName: Demo_05
 * Package: com.u6.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-28 9:32
 * @version 1.0
 */
public class Demo_05 {
    public static void main(String[] args) {
        /*
        浅拷贝：拷贝地址
        深拷贝：拷贝数值
         */

        int[] arr = new int[]{1,2,3};
        System.out.println(Arrays.toString(arr));

        System.out.println("==================");

        int[] arr1 = arr;
        System.out.println(Arrays.toString(arr1));
        //arr1和arr指向同一个数组对象  任意改动一个引用对应的元素值 另一个也是同步会改变的
        arr1[0] = 11;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        System.out.println("==================");
        int[] arr2 = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));
        //arr1和arr指向不同的数组对象  任意改动一个引用对应的元素值 另一个不会改变
        arr2[0] = 111;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
