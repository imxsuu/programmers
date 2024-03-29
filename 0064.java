# 등수 매기기
#
# 문제 설명
# 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sum = new int[score.length];
        int count;
        for (int i = 0; i < score.length; i++) {
            sum[i] += score[i][0] + score[i][1];
        }
        for (int i = 0; i < sum.length; i++) {
            count = 1;
            for (int j = 0; j < sum.length; j++) {
                if(sum[i] < sum[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}
