package com.u3.ch2;

/**
 * ClassName: PersonV3
 * Package: com.u3.ch2
 * Description:
 *
 * @author junbao3
 * Create 2024-08-19 19:08
 * @version 1.0
 */
public class PersonV3 {
    String name;
    int age;

    public PersonV3() {
        System.out.println("无参构造");
    }

    public PersonV3(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        PersonV3 personV3 = new PersonV3("zhangsan", 23);
        System.out.println(personV3.name);
        System.out.println(personV3.age);
    }

}
