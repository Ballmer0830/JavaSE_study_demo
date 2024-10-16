package com.u01.ch08.sec03;

/**
 * ClassName: StudentV2
 * Package: com.u01.ch08.sec02
 * Description:
 *
 * @author junbao3
 * Create 2024/10/17 5:58
 * @version 1.0
 */
public class StudentV2 extends PersonV2{
    public void show(){
        System.out.println("22222");
    }

    public void method(){
        show();
        this.show();
        super.show();
    }

    public static void main(String[] args) {
        new StudentV2().method();
    }
}
