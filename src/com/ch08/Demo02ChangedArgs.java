package com.ch08;

/**
 * ClassName: Demo02ChangedArgs
 * Package: com.ch08
 * Description:
 *
 * @author junbao3
 * Create 2024-10-09 10:22
 * @version 1.0
 */
public class Demo02ChangedArgs {
    public static void main(String[] args) {
        int i = getSum();
        System.out.println(i);

        int i1 = getSum(1);
        System.out.println(i1);

        int i2 = getSum(1,2,3);
        System.out.println(i2);
    }

    private static int getSum(int...i) {
        int sum = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            sum+=i1;
        }
        return sum;
    }
}
