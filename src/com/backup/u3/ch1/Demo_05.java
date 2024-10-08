package com.backup.u3.ch1;

/**
 * ClassName: Demo_05
 * Package: com.u3.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-16 9:41
 * @version 1.0
 */
public class Demo_05 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(getSum2(5));
    }

    private static int getSum2(int i) {
        if (i==1){
            return 1;
        }
        return getSum2(i-1)+i;
        /*
        递归最重要的思想 要有出口 一般是从大到小  到了最小值 留一个出口
        求1到5的和 倒着想
        5 = 4的和+5 = 3的和+4+5 = 2的和 + 3 +4 +5 = 1的和 + 2 +3 +4 +5
        1就是出口 1的和 就是1

        getSum2(5) =  getSum2(4)+5 = getSum2(3)+4+5 = getSum2(2)+3+4+5 = getSum2(1)+2+3+4+5 = 1+2+3+4+5
         */
    }
}
