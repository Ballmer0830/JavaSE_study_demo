package com.u4.ch2;

import sun.nio.cs.US_ASCII;

import java.util.ArrayList;

/**
 * ClassName: StudentV1
 * Package: com.u4.ch2
 * Description:
 *
 * @author junbao3
 * Create 2024-08-20 14:00
 * @version 1.0
 */
public class StudentV1 extends PersonV1{
//    public ArrayList getList(){
//        super.getList();
//        System.out.println("子类的方法");
//        return new ArrayList();
//    }

    public static void main(String[] args) {
        StudentV1 studentV1 = new StudentV1();
        studentV1.getList();
    }
}
