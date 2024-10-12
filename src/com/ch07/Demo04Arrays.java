package com.ch07;

import java.util.Arrays;

/**
 * ClassName: Demo04Arrays
 * Package: com.ch07
 * Description:
 *
 * @author junbao3
 * Create 2024/10/9 7:27
 * @version 1.0
 */
public class Demo04Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5};
        int[] arr2 = arr1;
        int[] arr3 =  {1,3,4,5};
        int[] arr4 = Arrays.copyOf(arr1, arr1.length);

        System.out.println(arr1==arr2);
        System.out.println(arr1==arr3);
        System.out.println(arr1==arr4);

        System.out.println("============");

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
        System.out.println(Arrays.equals(arr1, arr4));

        /*
        true
        false
        false
        ============
        true
        true
        true
         */
    }
}
