package code.java;

/**
 * https://app.codility.com/c/run/trainingUZW4QA-V5D/
 */

public class BinaryGap {

    public static void main(String[] args) {
        int N = 9;
//        int N = 529;
//        int N = 20;
//        int N = 15;
//        int N = 32;
//        int N = 1;
//        int N = 2147483647;
//        int N = 273;
//        int N = 272;
//        int N = 512;
//        int N = 511;

        int result = solution(N);
        System.out.println(result);
    }

    public static int solution(int N) {
        String s = Integer.toBinaryString(N);
        char one = '1';
        int idx = 0;
        int max = 0;
        int tmpLen = 0;

        while(idx < s.length()){
            if(s.charAt(idx) == one) {
                max = Math.max(max, tmpLen);
                tmpLen = 0;
            } else {
                tmpLen++;
            }

            idx++;
        }

        return max;
    }
}
