package com.ch10;

/**
 * ClassName: Demo02
 * Package: com.ch10
 * Description:
 *
 * @author junbao3
 * Create 2024/10/10 5:42
 * @version 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4};
        int[] arr3 = {5,6};
        //二维数组的长度是需要明确的，但是里面包含的一维数组长度可以相等 可以不等
//        int[][] arr = new int[][3];
        int[][] arr = new int[3][];



//        arr[0] = arr1;
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;

    }
}
