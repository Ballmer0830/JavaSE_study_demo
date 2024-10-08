package com.backup.u6.ch1;

/**
 * ClassName: Demo_04
 * Package: com.u6.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-27 11:22
 * @version 1.0
 */
public class Demo_04 {
    public static void main(String[] args) {
        int[] arr = new int[0];
//        method("1",null);
        method("1",arr);
    }

    public static void method(String str,int... arg){
        System.out.println(arg.length);
    }
}
