import java.util.Scanner;

//Enter a Binary string: 1011
//        The equivalent decimal number for binary "1011" is 11
//
//        Enter a Binary string: 1234
//        Error: Invalid Binary String "1234"
public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        int in = sc.nextInt();
        int result = 0;

        //将输入变为字符串
        String str = in + "";
        int i = 0;
        for(i = 0; i < str.length(); i++)
        {
            int j = str.charAt(i) - '0';
            if(j <= 1)
            {
                result = result * 2 + j;
            }
            else
            {
                System.out.printf("Error: Invalid Binary String \"%d\"", in);
                break;
            }
        }
        if(i == str.length())
        {
            System.out.printf("The equivalent decimal number for binary \"%d\" is %d", in, result);
        }


    }

}
