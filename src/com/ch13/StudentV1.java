package com.ch13;

/**
 * ClassName: StudentV1
 * Package: com.ch13
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 10:26
 * @version 1.0
 */
public class StudentV1 extends PersonV1{
    //验证super并不是父类的引用 无法打印


    @Override
    public void print() {
        //报错
//        System.out.println(super);

    }

    public void show(){
        System.out.println(this);
    }
}
