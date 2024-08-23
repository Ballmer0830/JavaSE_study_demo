package com.u4.ch2;

/**
 * ClassName: StudentV2
 * Package: com.u4.ch2
 * Description:
 *
 * @author junbao3
 * Create 2024-08-20 14:04
 * @version 1.0
 */
public class StudentV2 extends PersonV2{
    public StudentV2(String name, int age) {
        System.out.println("子类有参构造");
    }

    public StudentV2() {
        this("zhangsan",21);
//        super("zhangsan",21);
    }

    public static void init(){
    }



    public static void main(String[] args) {
        PersonV2 p2 = new PersonV2("zhangsan",23);
        StudentV2 studentV2 = new StudentV2();
        System.out.println(studentV2.name);

    }
}
