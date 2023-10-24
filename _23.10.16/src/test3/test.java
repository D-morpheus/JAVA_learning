package test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws ParseException {
        // 获取用户的出生日期
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的出生日期（格式：yyyy-MM-dd）：");
        String s1 = sc.next();


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(s1);

        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);

        //用于统计星期几
        int dayCounts[] = new int[7];

        int birthYear = cal.get(Calendar.YEAR);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        //开始打印
        for (int year = birthYear; year <= currentYear; year++) {
            int birthMonth = cal.get(Calendar.MONTH);
            int birthDay = cal.get(Calendar.DAY_OF_MONTH);
            int birthDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, birthMonth);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            System.out.println("年份：" + year);
            System.out.println("月份：" + (birthMonth + 1));

            int temp = cal.get(Calendar.DAY_OF_WEEK) - 1;
            cal.set(Calendar.DAY_OF_MONTH, birthDay);
            System.out.println("Sun\tMon\tTue\tWen\tThu\tFri\tSat");
            //输出指定月份第一天的空格
            for (int i = 1; i <= temp; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
                if (i == birthDay) {
                    System.out.print(i + "*\t");
                    dayCounts[cal.get(Calendar.DAY_OF_WEEK) - 1]++;
                } else {
                    System.out.print(i + "\t");
                }
                //将日历按星期换行
                if ((i + temp) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println("\n");

        }
        System.out.println("生日一周中每一天的百分比统计：");
        String[] dayNames = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        for (int i = 0; i < 7; i++) {
            double percentage = (double) dayCounts[i] / (currentYear - birthYear + 1) * 100;
            System.out.println(dayNames[i] + ": " + percentage + "%");
        }
    }
}

