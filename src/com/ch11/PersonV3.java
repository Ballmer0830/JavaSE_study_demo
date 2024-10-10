package com.ch11;

/**
 * ClassName: PersonV3
 * Package: com.ch11
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 9:37
 * @version 1.0
 */
public class PersonV3 {
    int name;

    public void show(){
        System.out.println(this.name);
        //一般省略 this
        System.out.println(name);
    }

    public void method(){
        this.show();
        //一般省略 this
        show();
    }
}
