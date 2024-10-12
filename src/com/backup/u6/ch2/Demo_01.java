package com.backup.u6.ch2;

/**
 * ClassName: Demo_01
 * Package: com.u6.ch2
 * Description:
 *
 * @author junbao3
 * Create 2024-08-28 13:50
 * @version 1.0
 */
public class Demo_01 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //异常。而且是运行时异常  ArrayIndexOutOfBoundsException
//        System.out.println(arr[3]);

        //错误 OutOfMemoryError
        int[] arr2 = new int[1024*1024*1024];
    }
}
