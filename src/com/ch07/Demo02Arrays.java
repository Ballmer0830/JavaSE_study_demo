package com.ch07;

import java.util.Arrays;

/**
 * ClassName: Demo02Arrays
 * Package: com.ch07
 * Description:
 *
 * @author junbao3
 * Create 2024/10/9 7:06
 * @version 1.0
 */
public class Demo02Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,8,3};
        Arrays.sort(arr1);
        //[1, 3, 3, 4, 5, 8]
        System.out.println(Arrays.toString(arr1));
        int key = 11;
        System.out.println(Arrays.binarySearch(arr1,key));
        //负值 都是从1开始算
        //-7  意味着 插入到8之后  元素所有值都比key小 就把key插入到末尾

        key = 2;
        System.out.println(Arrays.binarySearch(arr1,key));
        //-2 找到第一个元素比key大，返回这个元素的位置，插入的时候直接插入到这里 这个元素往后挪一位

    }
}
