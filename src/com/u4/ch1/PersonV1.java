package com.u4.ch1;

/**
 * ClassName: PersonV1
 * Package: com.u4.ch1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-21 15:43
 * @version 1.0
 */
public class PersonV1 {
    String name;
    int age;


    @Override
    public String toString() {
        return "name="+name+",age="+age+",nation="+nation;
    }

    static String nation;

    public PersonV1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        PersonV1.nation  = "China";
        PersonV1 p1 = new PersonV1("zhangsan",23);
        System.out.println(p1);

        PersonV1 p2 = new PersonV1("lisi",23);
        System.out.println(p2);
        p1.nation = "USA";

        System.out.println(p1);
        System.out.println(p2);
/*
name=zhangsan,age=23,nation=China
name=lisi,age=23,nation=China
name=zhangsan,age=23,nation=USA
name=lisi,age=23,nation=USA
 */
    }
}
