package com.demo;

/**
 * ClassName: HelloWorld
 * Package: com.demo
 * Description:
 *
 * @author junbao3
 * Create 2024/8/13 15:04
 * @version 1.0
 */

public class HelloWorld {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};

        arr = null;

        try{
            System.out.println(arr.length);
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }

        arr = new Integer[10];

        try{
            arr[10] = 10;
        }catch (IndexOutOfBoundsException e){
            System.out.println("越界异常");
        }

    }
}
