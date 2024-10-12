package com.ch13;

/**
 * ClassName: PersonV1
 * Package: com.ch13
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 10:25
 * @version 1.0
 */
public class PersonV1 {
    //验证super并不是父类的引用 无法打印


    public PersonV1() {
        System.out.println("父类初始化");
    }

    String name;

    public void print(){
        System.out.println(name);
    }
}
