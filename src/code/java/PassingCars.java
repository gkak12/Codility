package code.java;

/**
 * https://app.codility.com/c/run/training3A6TUR-BVN/
 * 
 * 누적합
 */

public class PassingCars {

    public static void main(String[] args) {
        int[] A = {0,1,0,1,1};
//        int[] A = {0,1,0,1};
//        int[] A = {0,1,0};
//        int[] A = {0,1,0,1,0,1,1};

        int result = solution(A);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        int zeroCnt = 0;    // 0 개수
        int total = 0;      // 지나간 차 대수

        for(int i = 0 ; i < A.length ; i++){    // 배열 탐색
            if(A[i] == 0) { // 현재 차가 0인 경우
                zeroCnt++;  // 0 개수 증가
            } else {    // 현재 차가 1인 경우
                total += zeroCnt;   // 지나간 차 대수와 0 개수 덧셈 처리
            }
        }

        return total;   // 지나간 차 대수 리턴
    }
}
