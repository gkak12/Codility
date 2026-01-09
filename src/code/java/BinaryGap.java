package code.java;

/**
 * https://app.codility.com/c/run/trainingUZW4QA-V5D/
 * 
 * 배열
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
        String s = Integer.toBinaryString(N);   // 숫자를 2진수 문자열로 변환
        char one = '1'; // '1' 문자
        int idx = 0;    // 인덱스
        int max = 0;    // 문자열 0의 최대 길이
        int subLen = 0; // 부분 문자열 0의 길이

        while(idx < s.length()){    // 문자열 탐색
            if(s.charAt(idx) == one) {  // 현재 문자가 '1'인 경우
                max = Math.max(max, subLen);    // 문자열 0의 최대 길이 갱신
                subLen = 0; // 부분 문자열 0으로 초기화
            } else {    // 현재 문자가 '0'인 경우
                subLen++;   // 부분 문자열 길이 1 증가
            }

            idx++;  // 인덱스 증가
        }

        return max; // 문자열 0의 최대 길이 리턴
    }
}
