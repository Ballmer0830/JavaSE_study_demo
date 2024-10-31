package com.u01.ch07.sec04.v2;

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
    private Student[] students = new Student[5];

    public boolean addStudent(Student student) {
        //原本students数组定义在addStudent方法内 因为下面查询的方法需要要这个数组
        //所以把这个数组挪到成员变量的位置 大家都可以用
        //Student[] students = new Student[5];
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

    public Student[] listStudent() {
        //原本
        return students;
    }
}
