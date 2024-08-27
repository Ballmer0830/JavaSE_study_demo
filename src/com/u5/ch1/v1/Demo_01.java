package com.u5.ch1.v1;

/**
 * ClassName: Demo_01
 * Package: com.u5.ch1.v1
 * Description:
 *
 * @author junbao3
 * Create 2024-08-23 14:59
 * @version 1.0
 */
public class Demo_01 {
    public  static void show(Animal animal){
        animal.eat();
    }
    public static void main(String[] args) {
        show(new Animal());
        show(new Dog());
        show(new Cat());
    }
}
