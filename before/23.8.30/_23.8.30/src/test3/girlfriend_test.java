package test3;

public class girlfriend_test {
    public static void main(String[] args) {
        girlfriend[] arr = new girlfriend[4];


        girlfriend gf1 = new girlfriend("a", 18, "girl", "read");
        girlfriend gf2 = new girlfriend("b", 19, "girl", "dance");
        girlfriend gf3 = new girlfriend("c", 20, "girl", "sleep");
        girlfriend gf4 = new girlfriend("d", 21, "girl", "eat");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i].getAge();
        }

        int avg = sum / arr.length;

        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i].getAge() <= avg)
            {
                System.out.printf("%s%d岁，是%s， 喜欢%s", arr[i].getName(), arr[i].getAge(), arr[i].getGender(), arr[i].getHobby());
            }
        }
    }
}
