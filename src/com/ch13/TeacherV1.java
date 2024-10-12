package com.ch13;

/**
 * ClassName: TeacherV1
 * Package: com.ch13
 * Description:
 *
 * @author junbao3
 * Create 2024-10-10 10:32
 * @version 1.0
 */
public class TeacherV1  extends PersonV1{
    String subject;


    public TeacherV1() {
        super();
        System.out.println("初始化");
    }

    public TeacherV1(String subject) {
        //super和this都想放第一  所以二者不能同时出现
//        super();
        this();
        this.subject = subject;
    }



}
