package com.ch11;

/**
 * ClassName: Demo02This
 * Package: com.ch11
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 9:25
 * @version 1.0
 */
public class Demo02This {
    int name;
    public static void main(String[] args) {
        Demo02This demo02This = new Demo02This();
        demo02This.method();
        System.out.println(demo02This);

        //method中打印this和直接打印调用method的对象demo02This是一样的
    }

    public void method(){
        //this只能存在于非静态方法中
        System.out.println(this);
        System.out.println(this.name);
    }
}
