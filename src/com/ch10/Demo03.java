package com.ch10;

/**
 * ClassName: Demo03
 * Package: com.ch10
 * Description:
 *
 * @author junbao3
 * Create 2024/10/10 5:47
 * @version 1.0
 */
public class Demo03 {
    public static void main(String[] args) {
        /*
        一维数组 可以直接用{}这种形式赋值
        二维数组 也可以直接用{{}}这种习惯是赋值
        但是二维数组中的元素不可以用{}赋值
         */
        int[] arr = {1,2,3};

        int[][] arr1 = {{1,2,3},{4,5}};
        int[][] arr3 = {new int[]{1,2,2},new int[]{4,5,6}};

        int[][] arr2 = new int[3][];
        //这种写法是不允许的
//        arr2[0] = {1,2,3};
        arr2[0] = new int[]{1,2,3};
        arr2[1] = arr;


    }
}
