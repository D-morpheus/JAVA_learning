import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = sc.nextInt();
        //System.out.println(integer);

        System.out.print("Enter a floating point number: " );
        double floatNum = sc.nextDouble();
        //System.out.println(float_num);

        System.out.print("Enter your name: ");
        String name = sc.next();
        //System.out.println(name);

        System.out.printf("Hi! %s, the sum of %d and %.2f is %.2f", name, integer, floatNum, integer + floatNum);
    }
}
