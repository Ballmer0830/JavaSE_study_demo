package com.u01.ch08.sec04;

/**
 * ClassName: StudentV3
 * Package: com.ch13
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 16:43
 * @version 1.0
 */
public class StudentV3 extends PersonV3 {
//    @Override
    private void showMoney(){
        //这仅仅是子类的一个独立方法 和父类无关
//        super.showMoney();
    }


//    @Override
    public static void method(){
        //这仅仅是子类的一个独立方法 和父类无关
//        super.method();
        System.out.println(3333);
    }

    public static void main(String[] args) {
        method1();
        method();
    }
}
