package com.u01.ch08.sec10;

/**
 * ClassName: Zi
 * Package: com.u01.ch08.sec10
 * Description:
 *
 * @author junbao3
 * Create 2024/10/17 7:41
 * @version 1.0
 */
public class Zi extends Fu{
    public Zi() {
        System.out.println(4);
    }

    {
        System.out.println(5);
    }

    static {
        System.out.println(6);
    }

    public static void main(String[] args) {
        System.out.println(7);
        new Zi();
        new Zi();
        System.out.println(8);
    }
}
