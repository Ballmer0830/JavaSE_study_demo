package com.u01.ch08.sec03;

/**
 * ClassName: StudentV1
 * Package: com.u01.ch08.sec02
 * Description:
 *
 * @author junbao3
 * Create 2024/10/17 5:31
 * @version 1.0
 */
public class StudentV1 extends PersonV1 {
//    private String name = "222";
    public void show(){
        String name = "333";
        System.out.println(name);
//        System.out.println(this.name);
//        System.out.println(super.name);
    }

    public static void main(String[] args) {
        new StudentV1().show();
    }
}
