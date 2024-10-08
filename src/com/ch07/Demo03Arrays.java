package com.ch07;

import java.util.Arrays;

/**
 * ClassName: Demo03Arrays
 * Package: com.ch07
 * Description:
 *
 * @author junbao3
 * Create 2024/10/9 7:21
 * @version 1.0
 */
public class Demo03Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,8,3};
        //深拷贝
        int[] copy1 = Arrays.copyOf(arr1, arr1.length-2);
        int[] copy2 = Arrays.copyOf(arr1, arr1.length);
        int[] copy3 = Arrays.copyOf(arr1, arr1.length+2);
        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(copy2));
        System.out.println(Arrays.toString(copy3));

        //验证深拷贝：拷贝的数组修改元素值，不影响原始数组的元素值

        System.out.println("=================");
        copy1[0]= 100;
        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(arr1));

    }
}
