package com.backup.u4.ch2;

/**
 * ClassName: PersonV2
 * Package: com.u4.ch2
 * Description:
 *
 * @author junbao3
 * Create 2024-08-20 14:03
 * @version 1.0
 */
public class PersonV2 {
    String name;
    int age;

    public PersonV2() {
        System.out.println(this);
    }

    public PersonV2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类有参构造");
    }

}
