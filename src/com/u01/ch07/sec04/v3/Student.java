package com.u01.ch07.sec04.v3;

/**
 * ClassName: Student
 * Package: com.u01.ch07.sec02
 * Description:
 *
 * @author junbao3
 * Create 2024-10-15 13:45
 * @version 1.0
 */
public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
