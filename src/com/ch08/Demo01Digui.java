package com.ch08;

/**
 * ClassName: Demo01Digui
 * Package: com.ch08
 * Description:
 *
 * @author junbao3
 * Create 2024-10-09 9:54
 * @version 1.0
 */
public class Demo01Digui {
    public static void main(String[] args) {
        //求1到5累加的和
        int sum  = getSum(5);
        System.out.println(sum);
    }

    /*
    result = 5 + getSum(4)
           = 5 + 4 + getSum(3)
     */
    private static int getSum(int i) {
        if (i==1){
            return 1;
        }
        return i+getSum(i-1);
    }
}
