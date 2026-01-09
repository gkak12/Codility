package code.java;

/**
 * https://app.codility.com/c/run/trainingEJ2XYU-9ER/
 */

public class FrogJmp {

    public static void main(String[] args) {
        int X = 10, Y = 85, D = 30;

        int result = solution(X, Y, D);
        System.out.println(result);
    }

    public static int solution(int X, int Y, int D) {
        int distance = Y-X; // 거리
        double cnt = Math.ceil((double)distance/D);  // 거리를 점프 몇번 해야 하는지 횟수 계산

        return (int) cnt;    // 횟수를 정수형으로 변환한 후 리턴
    }
}
