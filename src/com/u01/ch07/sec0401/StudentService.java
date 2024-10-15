package com.u01.ch07.sec0401;

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
    private StudentDao studentDao = new StudentDao();
    public boolean addStudent(Student student) {
//        StudentDao studentDao = new StudentDao();
        return studentDao.addStudent(student);
    }

    public Student[] listStudent() {
//        StudentDao studentDao = new StudentDao();
        Student[] students = studentDao.listStudent();
        int count = 0;
        for (Student student : students) {
            if (student==null){
                count++;
            }
        }
        return count==5?null:students;
    }
}
