package com.backup.u2.ch6;

/**
 * ClassName: Demo_04_v2
 * Package: com.u2.ch6
 * Description:
 *
 * @author junbao3
 * Create 2024-08-14 14:24
 * @version 1.0
 */
public class Demo_04_v2 {
    public static void main(String[] args) {
        int i = 1;
        int res = 1;
        int sum = 0;
        do {
            res = res*i;
            System.out.println(res);
            sum += res;
            i++;
        }while (i<=5);
        System.out.println(sum);
        http:for(;;){}//136
    }
}
