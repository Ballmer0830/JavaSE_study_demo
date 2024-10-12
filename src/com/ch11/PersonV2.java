package com.ch11;

/**
 * ClassName: PersonV2
 * Package: com.ch11
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 9:33
 * @version 1.0
 */
public class PersonV2 {
    //当局部变量和成员变量命名冲突的时候，通过this来区分

    int name = 19;

    public void method(){
        int name = 18;
        //成员变量和局部变量重名，就近原则
        System.out.println(name);
        //指定访问成员变量
        System.out.println(this.name);
    }

    public void setName(int name) {
        //name = name 把参数name赋值给参数name  无意义

        //参数name赋值给成员变量name
        this.name = name;
    }
}
