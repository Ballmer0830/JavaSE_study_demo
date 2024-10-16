package com.u01.ch08.sec10;

/**
 * ClassName: Fu
 * Package: com.u01.ch08.sec10
 * Description:
 *
 * @author junbao3
 * Create 2024/10/17 7:41
 * @version 1.0
 */
public class Fu {
    public Fu() {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }

    static {
        System.out.println(3);
    }
}
