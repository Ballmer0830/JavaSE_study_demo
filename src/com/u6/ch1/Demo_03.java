package com.u6.ch1;

import java.util.Arrays;

/**
 * ClassName: Demo_03
 * Package: com.u6.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-27 10:55
 * @version 1.0
 */
public class Demo_03 {
    public static void main(String[] args) {
        int[] arr = {9,1,3,8,7};
        //增强for循环可以修改元素值? 不可以
        for (int i : arr) {
            //arr的元素依次赋值给局部变量i
            //修改也好 赋值也好 也只是操作局部变量  跟数组没有关系
            if (i==9){
                i+=1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("============");
        //for循环可以给数组元素赋值吗
        int[] arr1 = new int[3];
        for (int i : arr1) {
            i = 1;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
