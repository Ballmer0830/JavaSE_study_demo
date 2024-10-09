package com.ch10;

import java.util.Arrays;

/**
 * ClassName: Demo01
 * Package: com.ch10
 * Description:
 *
 * @author junbao3
 * Create 2024/10/10 5:31
 * @version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        //二维数组定义好了所包含的一维数组的长度
        //但是传入二维数组的一维数组超过了长度

        int[] arr = new int[]{1,2,3,4};
        int[][] arr1 = new int[2][3];
        //arr1限制了所包含的一维数组的长度是3
        //把长度为4的arr放进arr1

        arr1[0] = arr;
        for (int[] ints : arr1) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println(arr1[0][3]);
        arr1[0][3] = 9;
        System.out.println(arr1[0][3]);

        /*
        [1, 2, 3, 4]
        [0, 0, 0]
        4
        9
         */
    }
}
