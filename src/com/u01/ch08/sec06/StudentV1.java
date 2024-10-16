package com.u01.ch08.sec06;

/**
 * ClassName: StudentV1
 * Package: com.u01.ch08.sec06
 * Description:
 *
 * @author junbao3
 * Create 2024/10/17 6:25
 * @version 1.0
 */
public class StudentV1 extends PersonV1{

    public StudentV1(String name) {
        super(name);
    }

    public StudentV1() {
        super(null);
    }

    public static void main(String[] args) {
        new StudentV1();
    }
}
