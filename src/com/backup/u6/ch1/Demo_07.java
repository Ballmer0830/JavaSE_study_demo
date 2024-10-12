package com.backup.u6.ch1;

/**
 * ClassName: Demo_07
 * Package: com.u6.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-28 10:45
 * @version 1.0
 */
public class Demo_07 {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        System.out.println(arr);//[[I@4554617c
        System.out.println(arr.length);
        System.out.println(arr[0]);//[I@74a14482
        System.out.println(arr[0].length);
        System.out.println(arr[0][0]);

        System.out.println("=================");
        
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6}};
        int[][] arr2 = {{1,2,3},{4},{5,6}};

        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr1[i].length; i1++) {
                System.out.print(arr1[i][i1]+"\t");
            }
            System.out.println();
        }
        System.out.println("=================");

        //二维数组定义 至少要把外层数据的长度定下来
        //里面的数组长度可以不定义，可以不用保持一致
        int[][] arr3 = new int[2][];
        arr3[0] = new int[1];
        arr3[1] = new int[2];
        arr3[2] = new int[3];

    }
}
