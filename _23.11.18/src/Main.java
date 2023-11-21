import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[][] arr = new String[10000][2];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                arr[i][j] = sc.next();
            }
        }

        System.out.println();
        String result = "";
        String str = "";
        for(int i= 0; i < m; i++){
            str = sc.next();
            result = find(arr, str, n);
            if(result.equals(str))
            {
                System.out.println("NULL");
            }
            else
            {
               find2(arr, str, n, result);
            }
        }
    }

    public static String find(String[][] arr, String str, int n){
        for(int i = 0; i < n; i++)
        {
            if(arr[i][0].equals(str))
            {
                return arr[i][1];
            }
        }
        return str;
    }

    public static void find2(String[][] arr, String str, int n, String result){
            str = result;
            result = find(arr, str, n);
            if(result.equals(str))
            {
                System.out.println(result);
                return ;
            }
            else
            {
                find2(arr, str, n, result);
            }
    }
}

//3 4
//        160.116.151.74 254.27.124.39
//        248.122.91.212 39.60.211.50
//        185.23.1.167 177.138.76.178
//        63.182.123.188
//        185.23.1.167
//        160.116.151.74
//        248.122.91.212