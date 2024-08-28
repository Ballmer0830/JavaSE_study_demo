package com.u6.ch1;

import java.util.Arrays;

/**
 * ClassName: Demo_06
 * Package: com.u6.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-28 10:26
 * @version 1.0
 */
public class Demo_06 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8,3};
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, -1));

        System.out.println("================");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("================");
        //新数组长度小于原始数组长度
        int[] arr1 = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(arr1));
        //新数组长度大于原始数组长度
        int[] arr2 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr2));

        System.out.println("================");
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3.equals(arr));
        //只比较元素内容，相当于是重写equals
        System.out.println(Arrays.equals(arr, arr3));

        System.out.println("================");
        char[] arr4 = new char[5];
        Arrays.fill(arr4,'a');
        System.out.println(Arrays.toString(arr4));
    }
}
