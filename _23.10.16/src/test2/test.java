package test2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        StringBuilder sb1 = new StringBuilder(s1);

        //将句号改为逗号
        sb1 = sb1.delete(sb1.length()-1, sb1.length());
        sb1 = sb1.append(", ");

        String s2 = "";
        int count = 0;
        int index = 0;

        for(int i = 0; i < s1.length(); i++)//将前两个单词放入s1中
        {
            if(s1.charAt(i) != ' ')
            {
                if(i == 0)
                {
                    s2 += Character.toLowerCase(s1.charAt(i));
                }
                else
                {
                    s2 += s1.charAt(i);
                }
            }
            else if(s1.charAt(i) == ' ')
            {
                count += 1;
                s2 += ' ';
            }
            if(count == 2)
            {
                index = i + 1;
                break;
            }
        }

        StringBuilder sb2 = new StringBuilder(s2);
        sb1 = sb1.append(s2);

        //删除前两个单词
        sb1.delete(0, index);

        //将最后一个字符改为问号
        sb1 = sb1.delete(sb1.length()-1, sb1.length());
        sb1 = sb1.append("? ");

        //修改第一个单词大小写
        String result = "";
        result += Character.toUpperCase(sb1.charAt(0));
        sb1.delete(0, 1);
        result += sb1.toString();
        System.out.println(result);

    }
}
