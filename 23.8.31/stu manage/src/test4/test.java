package test4;

public class test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "张三", 23);
        Student stu2 = new Student(2, "李四", 24);
        Student stu3 = new Student(3, "王五", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        printarr(arr);


        int index = getIndex(arr, 4);
        if(index >= 0)
        {
            arr[index].setAge(arr[index].getAge() + 1);
        }
        else
        {
            System.out.println("id不存在，增加失败");
        }

        printarr(arr);//遍历数组

//        Student stu4 = new Student(4, "赵六", 26);
//
//        boolean flag = contains(arr, stu4.getId());
//        if(flag)//检测id是和否存在
//        {
//            System.out.println("当前id已存在");
//        }
//        else//无重复id时,检查数组长度够不够
//        {
//            int count = getcount(arr);
//            if(count == arr.length)
//            {
//                //创建,克隆新数组
//                Student[] newarr = creat_new_arr(arr);
//                newarr[count] = stu4;
//                printarr(newarr);
//            }
//            else
//            {
//                arr[count] = stu4;
//                printarr(arr);
//            }
//        }

    }

    public static boolean contains(Student[] arr, int id)//检查是否有相同id
    {
        for(int i = 0; i < getcount(arr); i++)
        {
            if(arr[i].getId() == id)
            {
                return true;
            }
        }
        return false;
    }

    public static int getcount(Student arr[])//计算原数组中有几个非空元素
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != null)
            {
                count++;
            }
        }
        return count;
    }

    public static Student[] creat_new_arr(Student[] arr)//创建新数组
    {
        Student arr2[] = new Student[arr.length + 1];

        for(int i = 0; i < arr.length; i++)
        {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static void printarr(Student[] arr)//打印数组
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != null)
            {
                System.out.println(arr[i].getId() + arr[i].getName() + arr[i].getAge());
            }
        }
        System.out.println();
    }

    public static int getIndex(Student[] arr, int id)//找相同id索引
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
}
