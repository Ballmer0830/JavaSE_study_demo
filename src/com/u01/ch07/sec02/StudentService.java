package com.u01.ch07.sec02;

/**
 * ClassName: StudentService
 * Package: com.u01.ch07.sec02
 * Description:
 *
 * @author junbao3
 * Create 2024-10-15 13:43
 * @version 1.0
 */
public class StudentService {
    public boolean addStudent(Student student) {
        StudentDao studentDao = new StudentDao();
        return studentDao.addStudent(student);
    }
}
