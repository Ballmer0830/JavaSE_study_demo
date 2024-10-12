package com.ch07;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ClassName: Demo01For
 * Package: com.ch07
 * Description:
 *
 * @author junbao3
 * Create 2024/10/9 6:49
 * @version 1.0
 */
public class Demo01For {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));

        //这种赋值是无效的
        for (int i : arr) {
            i = 9;
        }
        System.out.println(Arrays.toString(arr));
    }
}
