package com.mor.StudentSystem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.mor.StudentSystem.StudentSystem.StudentSys;

public class User_test {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------欢迎来到学生管理系统-------");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.println("请选择操作：");


            String choose = sc.next();

            switch (choose)
            {
                case "1" -> sign_in(list);
                case "2" -> list = sign_up(list);
                case "3" -> forgetPasswrd(list);
                case "houmen" -> {System.out.println("开后门成功，查看所有账户信息");
                houmen((list));}
                default -> System.out.println("没有这个选项，请重新选择");
            }
        }
    }

    /*注册*/public static ArrayList<User> sign_up(ArrayList<User> list)
    {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        String name = "";
        while (true) {
            System.out.println("请输入要注册的用户名：");
            name = sc.next();

            if(name.length() < 3 || name.length() > 15)//判断长度
            {
                System.out.println("用户名要求在3-15字符内");
                continue;
            }

            if(name_legal_Check(name))//判断用户名是否合法
            {

            }
            else
            {
                continue;
            }

            if(nameCheck(list, name))//判断用户名是否已存在
            {
                System.out.println("用户名已存在，请重新输入");
            }
            else
            {
                user.setName(name);
                break;
            }
        }//用户名输入

        while (true) {
            System.out.println("请输入密码：");
            String pas1 = sc.next();
            System.out.println("请确认密码：");
            String pas2 = sc.next();

            if(pas1.equals(pas2))
            {
                user.setPassword(pas1);
                break;
            }
            else
            {
                System.out.println("两次密码输入不一致，请重新输入");
            }
        }//密码输入

        while(true) {
            System.out.println("请输入身份证号：");
            String id = sc.next();
            if(idCheck(id))
            {
                user.setId(id);
                break;
            }
            else
            {
                System.out.println("身份证号不合法");
                continue;
            }

        }//身份证输入

        while(true) {
            System.out.println("请输入手机号：");
            String phone = sc.next();
            if(phoneCheck(phone))
            {
                user.setPhone(phone);
                break;
            }
            else
            {
                System.out.println("手机号不合法");
                continue;
            }
        }//手机号输入

        list.add(user);
        User u1 = list.get(0);
        System.out.println("注册成功，您的用户名是：" + u1.getName());
        //System.out.println("注册成功，您的用户名是：" + u1.getName() + "密码"+u1.getPassword()+"身份证号"+ u1.getId()+"电话号"+u1.getPhone());

        return list;
    }

    /*登录*/public static void sign_in(ArrayList<User> list)
    {
        int index = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输用户名");
            String name = sc.next();
            index = nameindex(list, name);
            if(index >= 0)
            {
                break ;
            }
            else
            {
                System.out.println("未注册");
                return;
            }
        }//输入用户名

        if(passworldCheck(list.get(index)))//输入密码
        {
        }
        else
        {
            System.out.println("登录错误，账号已注销");
            return;
        }


        while (true) {
            if(Captcha())//验证码
            {
                System.out.println("登录成功");
                StudentSys();
                return;
            }
            else
            {
                System.out.println("验证码错误");
            }
            return;
        }

    }

    /*忘记密码*/public static void forgetPasswrd(ArrayList<User> list)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改密码的用户名：");
        String name = sc.next();
        int index = nameindex(list, name);
        if(index < 0)
        {
            System.out.println("用户名不存在");
            return;
        }
        User user = list.get(index);
        System.out.println("请输入用户的"+user.getName()+"身份证号");
        String id = sc.next();
        System.out.println("请输入用户的"+user.getName()+"手机号");
        String phone = sc.next();

        if(user.getId().equalsIgnoreCase(id) && user.getPhone().equalsIgnoreCase(phone))//修改密码
        {
            while (true) {
                System.out.println("请输入修改后的密码：");
                String pas1 = sc.next();
                System.out.println("请确认密码：");
                String pas2 = sc.next();

                if(pas1.equals(pas2))
                {
                    user.setPassword(pas1);
                    System.out.println("密码修改成功");
                    return;
                }
                else
                {
                    System.out.println("两次密码输入不一致，请重新输入");
                }
            }
        }
        else//验证失败
        {
            System.out.println("身份证号或手机号错误，无法修改密码");
            return;
        }

    }

    /*验证码校验*/public static boolean Captcha()
    {
        Scanner sc = new Scanner(System.in);
        String c = Captcha_generate();
        System.out.println("验证码" + c);
        System.out.println("请输入验证码：" );

        String in = sc.next();

        while (true) {
            if(c.equalsIgnoreCase(in))
            {
                return true;
            }
        }
    }

    /*验证码生成*/public static String Captcha_generate()
    {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        char[] Cha = new char[52];

        for (int i = 0; i < 26; i++) {
            Cha[i] =(char)('a' + i);
        }
        for (int i = 26; i < 52; i++) {
            Cha[i] =(char)('A' + i - 26);
        }

        for (int i = 0; i < 4; i++) {
            sb.append(Cha[r.nextInt(52)]);
        }

        sb.append(r.nextInt(10));

        char[] arr = sb.toString().toCharArray();

        int rindex = r.nextInt(arr.length);
        char tmp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[rindex];
        arr[rindex] = tmp;

        return new String(arr);
    }

    /*返回用户名索引*/public static int nameindex(ArrayList<User> list, String name)
    {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }

    /*确认用户名是否已存在*/public static boolean nameCheck(ArrayList<User> list, String name)
    {
        return nameindex(list, name) > 0;
    }

    /*确认用户名是否合法*/public static boolean name_legal_Check(String name)
    {
        int num = 0;
        int cha = 0;
        for (int i = 0; i < name.length(); i++)
        {
            char c = name.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                cha++;
            }
            else if (c >= 'A' && c <='Z')
            {
                cha++;
            }
            else if (c >= '0' && c <= '9')
            {
                num++;
            }
            else
            {
                System.out.println("用户名仅能由字母或数字组成");
                return false;
            }
        }
        if (cha == 0)
        {
            System.out.println("用户名不能由纯数字组成");
            return false;
        }
        return true;
    }

    /*确认id是否合法*/public static boolean idCheck(String id)
    {
        if(id.length() != 18)
        {
            return false;
        }
        if(id.charAt(0) == '0')
        {
            return false;
        }
        for (int i = 0; i < id.length() - 1; i++)
        {
            char c = id.charAt(i);
            if(c < '0' || c > '9')
            {
                return false;
            }
        }
        char c = id.charAt(17);
        if ((c > '0' && c < '9') || c == 'x' || c == 'X')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /*确认手机号是否合法*/public static boolean phoneCheck(String phone)
    {
        if(phone.length() != 11)
        {
            return false;
        }
        if(phone.charAt(0) == '0')
        {
            return false;
        }
        for (int i = 0; i < phone.length(); i++)
        {
            char c = phone.charAt(i);
            if(c < '0' || c > '9')
            {
                return false;
            }
        }
        return true;
    }

    /*检验密码是否正确，并返回剩余次数*/public static boolean passworldCheck(User user)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            System.out.println("请输入密码");
            String password = sc.next();

            if(user.getPassword().equals(password))
            {
                return true;
            }
            else
            {
                System.out.printf("密码错误，剩余%d次机会\n", 2 - i);
            }
        }
        return false;
    }

    /*后门*/public static void houmen(ArrayList<User> list)
    {
        for (int i = 0; i < list.size(); i++) {
            User u1 = list.get(i);
            System.out.println("用户名" + u1.getName() + "密码"+u1.getPassword()+"身份证号"+ u1.getId()+"电话号"+u1.getPhone());
        }
        return;
    }
}
