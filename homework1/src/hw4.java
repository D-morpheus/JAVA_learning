import java.util.Scanner;
//The equivalent binary for hexadecimal "1abc" is 0001 1010 1011 1100
public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hexBits = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};

        System.out.println("Enter a Hexadecimal string: ");
        //输入十六进制
        String str = sc.next();
        System.out.printf("The equivalent binary for hexadecimal \"%s\" is ", str);
        for(int i = 0; i < str.length(); i++)
        {
            int index = 0;
            char c = str.charAt(i);
            //分数字，小写字母，大写字母三类讨论
            if('0' <= c && c <= '9')
            {
                index = (c - '0');
            }
            else if ('a' <= c && c <= 'f')
            {
                index  = c - 'W';
            }
            else if ('A' <= c && c <= 'F')
            {
                index  = c - '7';
            }
            System.out.print(hexBits[index] + ' ');
        }

    }
}
