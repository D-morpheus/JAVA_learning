package homework;
//定义数组存储3个学生对象。
//        学生的属性：学号，姓名，年龄。
//        要求1：添加的时候需要进行学号的唯一性判断。
//        要求2：添加完毕之后，遍历所有学生信息。
//        要求3：通过id删除学生信息
//        如果存在，则删除，如果不存在，则提示删除失败。
//        要求4：删除完毕之后，遍历所有学生信息。
//        要求5：id为2的学生，年龄+1岁
public class Student_test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "zhangsan", 18);
        Student stu2 = new Student(2, "lisi", 19);
        Student stu3 = new Student(3, "wangwu", 20);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(4, "zhaoliu", 21);
        Student stu5 = new Student(5, "我", 22);

        print(arr);
        arr = add_stu(arr, stu4);
        print(arr);
        delete_stu(arr, 2);
        print(arr);
        add_stu(arr, stu5);
        print(arr);





    }
    /*增加学生*/public  static Student[] add_stu(Student[] arr, Student newstu)
    {
        if(idCheck(arr, newstu.getId()) != -1)
        {
            System.out.println("id已存在，请检查后再试");
        }
        else
        {
            //检查数组是否已满
            if(nullIndex(arr) == -1)
            {
                //构建新数组
                arr = newarr(arr);
                arr[arr.length - 1] = newstu;//新数组替换旧数组
                System.out.println("录入成功");
            }
            else
            {
                //成功录入
                arr[nullIndex(arr)] = newstu;
                System.out.println("录入成功");
            }
        }
        return arr;
    }

    /*删除学生*/public static void delete_stu(Student[] arr, int id)
    {
        int index = idCheck(arr, 2);
        if(index == -1)
        {
            System.out.println("id不存在，请确认后再试");
        }
        else
        {
            arr[index] = null;
            System.out.println("删除成功");
        }
    }
    /*遍历所有学生信息*/public static void print(Student[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != null)
            {
                Student a = arr[i];
                System.out.println(a.getId() + a.getName() + a.getAge());
            }
        }
        System.out.println();
    }

    /*学号唯一性检验*/public static int idCheck(Student[] arr, int id)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != null)
            {
                if(id == arr[i].getId())
                {
                    return i;
                }
            }
        }
        return -1;
    }

//    /*数组存量检查*/public static int arrCheck(Student[] arr)
//    {
//        int re = 0;
//        for(int i = 0; i < arr.length; i++)
//        {
//            if (arr[i] != null)
//            {
//                re++;
//            }
//        }
//        return re;
//    }

    /*返回空索引*/public static int nullIndex(Student[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == null)
            {
                return i;
            }
        }
        return -1;
    }

    /*构建新数组*/public static Student[] newarr(Student[] arr)
    {
        Student[] newarr = new Student[arr.length + 1];
        for(int i = 0; i < arr.length; i++)
        {
            newarr[i] = arr[i];
        }
        return newarr;
    }
}
