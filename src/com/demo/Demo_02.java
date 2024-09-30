package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Demo_02
 * Package: com.demo
 * Description:集合排序
 *
 * @author junbao3
 * Create 2024-08-29 9:18
 * @version 1.0
 */
public class Demo_02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 9, 6, 7, 3, 5);
        Collections.sort(list);
        System.out.println(list);
    }
}
