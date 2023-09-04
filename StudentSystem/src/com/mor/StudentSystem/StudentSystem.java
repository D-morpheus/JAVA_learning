package com.mor.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void StudentSys()
    {
        ArrayList<Student> list = new ArrayList<>();
        loop:while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");

            String choose = sc.next();

            switch (choose)
            {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项，请重新选择：");
            }
        }

    }

    public static void addStudent(ArrayList<Student> list){
        Student stu = new Student();//新建学生

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入学生id：");
            stu.setId(sc.next());
            if(idCheck(list, stu.getId()) != -1)
            {
                System.out.println("id已存在，请重新输入");
            }
            else
            {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        stu.setName(sc.next());

        System.out.println("请输入学生年龄：");
        stu.setAge(sc.nextInt());

        System.out.println("请输入学生地址：");
        stu.setAdddress(sc.next());

        list.add(stu);

        System.out.println("添加成功");
    }
    public static void deleteStudent(ArrayList<Student> list){
        System.out.println("请输入要删除的学生id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        int index = idCheck(list,id);
        if(index == -1)
        {
            System.out.println("id不存在");
            return;
        }
        else
        {
            list.remove(index);
            System.out.println("id为"+id+"的学生已删除");
        }
    }
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("请输入要修改的学生id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        int index = idCheck(list,id);
        if(index == -1)
        {
            System.out.println("id不存在");
            return;
        }
        else
        {
            Student stu = list.get(index);
            System.out.println("请输入该学生修改后的姓名：");
            stu.setName(sc.next());
            System.out.println("请输入该学生修改后的年龄：");
            stu.setAge(sc.nextInt());
            System.out.println("请输入该学生修改后的地址：");
            stu.setAdddress(sc.next());



            System.out.println("修改成功");
        }
    }
    /*查询*/public static void queryStudent(ArrayList<Student> list){
        if (list.size() == 0)
        {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId()+"\t\t"+stu.getName()+"\t" + stu.getAge() +"\t" +stu.getAdddress());
        }

    }

    public static int idCheck(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) //检验id是否唯一
        {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
