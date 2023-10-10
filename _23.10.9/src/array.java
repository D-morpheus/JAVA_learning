import java.lang.annotation.ElementType;

public class array {
    public static void main(String[] args) {
        int[] A={1, 1, 2, 3, 4, 5, 5, 6, 7};
        int[] B={1, 2, 3, 4,5, 5, 6, 7, 8};

        arr(A, B);
        for(int i = 0; i < A.length; i++)
        {
            System.out.println(A[i]);
        }
    }
    public static void arr(int[] A, int[] B){
        int index1 = 0;
        int index2 = 0;
        int index = 0;

        while (index1 < A.length && index2 < B.length) {
            if(A[index1] == B[index2])
            {
                A[index] = A[index1];
                index1++;
                index2++;
                index++;
            }
            else if(A[index1] < B[index2])
            {
                index1++;
            }
            else if(A[index1] > B[index2])
            {
                index2++;
            }
        }

        for(int i = index; i < A.length; i++)//将A中剩余元素置零
        {
            A[index] = 0;
        }
    }
}

