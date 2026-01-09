package code.java;

/**
 * https://app.codility.com/c/run/training3A6TUR-BVN/
 */

import java.util.*;

public class PassingCars {

    public static void main(String[] args) {
        int[] A = {0,1,0,1,1};
        int result = solution(A);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        int zeroCnt = 0;
        int total = 0;

        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == 0) {
                zeroCnt++;
            } else {
                total += zeroCnt;
            }
        }

        return total;
    }
}
