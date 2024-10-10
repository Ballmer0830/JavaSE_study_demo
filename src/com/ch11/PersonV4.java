package com.ch11;

/**
 * ClassName: PersonV4
 * Package: com.ch11
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 9:45
 * @version 1.0
 */
public class PersonV4 {
    //构造方法重载
    String name;

    int age;

    char sex;
    String nation;

    public PersonV4() {
        this.nation = "China";
    }

    public PersonV4(String name, int age,char sex) {
        //需要把国籍初始化 不需要再写一遍this.nation = "China";
        //用this调用无参构造
        this();
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    //创建一个男性的person
    public PersonV4(String name, int age) {
        //this指向构造函数必须在第一句
//        System.out.println("创建一个男性的person");
        this(name,age,'m');

    }
}
