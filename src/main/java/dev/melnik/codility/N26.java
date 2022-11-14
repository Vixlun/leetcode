package dev.melnik.codility;

public class N26 {
    public static void main(String[] args) {
        Problems problem = new Problems();
//        System.out.println(problem.solution(new int[]{1, 2, 3}, 3));
//        System.out.println(problem.solution(new int[]{1, 1, 3}, 2));
//        System.out.println(problem.solution(new int[]{3, 3}, 3));

//        System.out.println(problem.solution2(new int[]{3, 2, 1, 1, 2, 3, 1}));
//        System.out.println(problem.solution2(new int[]{4, 1, 4, 1}));

        System.out.println(problem.solution3(new int[]{2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5}));
        System.out.println(problem.solution3(new int[]{-3, -3}));

    }
}

class Problems {
    public boolean solution1(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        return (A[0] == 1 && A[n - 1] == K);
    }

    public int solution2(int[] A) {
            int[] arr = new int[] {0, 0, 0, 0};
            int minChanges = Integer.MAX_VALUE;
            for(int currentElement : A) {
                arr[currentElement -1] += 1;
            }

            for(int element = 0; element < arr.length; element++) {
                minChanges = Math.min(countDiff(arr, element), minChanges);
            }
            return minChanges;
        }

        private int countDiff(int[] arr, int element) {
            int changes = 0;
            for(int i = 0; i < arr.length; i++) {
                if(i != element) {
                    changes += arr[i]*Math.abs(i - element);
                }
            }
            return changes;
        }

    public int solution3(int[] A) {
        int N = A.length;
        if (N == 1) return 1;
        int count = 1;
        for(int i = 1; i < N - 1; i++) {
            if((A[i-1] > A[i]) && (A[i] > A[i+1])
                || (A[i-1] < A[i]) && (A[i] < A[i+1])) {
                count++;
            }
        }
        if(A[N-1] != A[N-2]) count++;

        return count;
    }
}

