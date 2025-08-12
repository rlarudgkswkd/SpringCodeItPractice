package org.example.Head02_OOPpragramming.topic01AndTopic02.example01;

public class ProceduralGradeManager {
    public static void main(String[] args) {
        String[] studentNames = {"Alice", "Bob", "Charlie"};
        int[] mathScores = {90, 80, 85};
        int[] engScores = {95, 75, 88};
        int[] sciScores = {65, 100, 60};

        for (int i = 0; i < studentNames.length; i++) {
            int total = mathScores[i] + engScores[i] + sciScores[i];
            double average = total / 3.0;
            System.out.printf("%s 평균: %.1f\n", studentNames[i], average);
        }

        //요구사항 : 학생들의 수학, 영어 평균 점수를 출력해주세요.
        //요구사항2 : 과학 성적도, 전체 점수, ...? ,
        //요구사항3 :
        //요구사항4, 5,6,
    }
}
