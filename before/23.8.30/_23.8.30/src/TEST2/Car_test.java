package TEST2;

import java.util.Scanner;

public class Car_test {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            Car c = new Car();
            System.out.println("请输入品牌");
            c.setBrand(sc.next());
            System.out.println("请输入价格");
            c.setPrice(sc.nextInt());
            System.out.println("请输入颜色");
            c.setColor(sc.next());

            arr[i] = c;
        }

        for(int i = 0 ;i < arr.length; i++)
        {
            System.out.printf("品牌：%s, 价格：%d, 颜色：%s\n", arr[i].getBrand(), arr[i].getPrice(), arr[i].getColor());
        }
    }
}
