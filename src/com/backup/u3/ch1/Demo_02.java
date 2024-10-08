package com.backup.u3.ch1;

/**
 * ClassName: Demo_02
 * Package: com.u3.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-16 9:02
 * @version 1.0
 */
public class Demo_02 {
    public static void main(String[] args) {
        test();
    }

    private static int test() {
        for (int i = 0; i < 5; i++) {
            if (i==2){
                return 1;
            }
        }
        //这个return是必须的
        return 2;
    }
}
