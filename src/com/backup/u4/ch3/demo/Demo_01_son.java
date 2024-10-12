package com.backup.u4.ch3.demo;

import com.backup.u4.ch3.Demo_01;

/**
 * ClassName: Demo_03
 * Package: com.u4.ch3.demo
 * Description:
 *
 * @author junbao3
 * Create 2024-08-22 19:29
 * @version 1.0
 */
public class Demo_01_son extends Demo_01 {
    public void method(){
        Demo_01 d1= new Demo_01();
//        System.out.println(d1.name);
//        System.out.println(d1.age);
//        System.out.println(d3.nation);
        System.out.println(d1.socre);

        System.out.println(this.nation);
        System.out.println(this.socre);
    }
}
