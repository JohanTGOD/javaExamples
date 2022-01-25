package interview;

import java.util.Arrays;

public class Some {
    public static void main(String[] args) {
        int[] some = {1,1, 2,3, 4, 5, 6, 7, 8};

        System.out.println(solution(some, 10));
    }

    public static  boolean solution(int[] A, int K) {
            int n = A.length;
            for (int i = 0; i < n - 1; i++) {
                if (A[i] + 1 < A[i + 1])
                    return false;
            }
            if (Arrays.stream(A).noneMatch(x->x==K))
                return false;
            else
                return true;
        }
}

