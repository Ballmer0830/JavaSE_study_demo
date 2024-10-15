package com.u01.ch07.sec02;

/**
 * ClassName: StudentDao
 * Package: com.u01.ch07.sec02
 * Description:
 *
 * @author junbao3
 * Create 2024-10-15 13:52
 * @version 1.0
 */
public class StudentDao {

    public boolean addStudent(Student student) {
        Student[] students = new Student[5];
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                index = i;
                break;
            }
        }
        if (index == -1){
            return false;
        }
        students[index] = student;
        return true;
    }
}
