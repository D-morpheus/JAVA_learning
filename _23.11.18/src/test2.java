import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[3000];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int last = 0;
        int sum = 0;

        for(int i = 0; i < n - k + 1; i++ )
        {
            last = arr[3000 - i - 1];
            sum = 0;
            for(int j = 0; j < k-1; j++)
            {
                sum += arr[3000 - i - j - 2];
            }
            System.out.println("sum:" +sum + "last" + last);
            if(sum > last)
            {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");


    }
}
