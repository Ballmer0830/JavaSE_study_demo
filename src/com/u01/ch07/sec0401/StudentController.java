package com.u01.ch07.sec0401;

import java.util.Scanner;

/**
 * ClassName: StudentController
 * Package: com.u01.ch07.sec02
 * Description:
 *
 * @author junbao3
 * Create 2024-10-15 11:26
 * @version 1.0
 */
public class StudentController {
    private StudentService studentService = new StudentService();
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("=======欢迎来到<学生>管理系统=======");
            System.out.println("请输入您的选择：1.添加学生 2.查询学生 5.退出");
            String operate = scanner.next();
            switch (operate){
                case "1":
                    addStudent();
                    break;
                case "2":
                    listStudent();
                    break;
                case "5":
                    System.out.println("再见");
                    return;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }

    private void listStudent() {
//        StudentService studentService = new StudentService();
        Student[] students = studentService.listStudent();
        if (students == null){
            System.out.println("学生信息为空，请添加再查询");
            return;
        }
        System.out.println("id\t\tname");
        for (Student student : students) {
            if(student!=null){
                System.out.println(student.getId()+"\t\t"+student.getName());
            }
        }
    }

    private void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生id：");
        int id = scanner.nextInt();
        System.out.println("请输入学生姓名：");
        String name = scanner.next();
        Student student = new Student(id, name);
//        StudentService studentService = new StudentService();
        boolean result = studentService.addStudent(student);
        if (result){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }
}