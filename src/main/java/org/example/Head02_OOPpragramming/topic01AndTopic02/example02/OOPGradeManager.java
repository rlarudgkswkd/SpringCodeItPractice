package org.example.Head02_OOPpragramming.topic01AndTopic02.example02;

class Student {
    String name;
    String age;
    int mathScore;
    int engScore;
    int sciScore;

    Student(String name, int mathScore, int engScore, int sciScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.engScore = engScore;
        this.sciScore = sciScore;
    }

    double getAverage() {
        return (mathScore + engScore + sciScore) / 3.0;
    }
}

public class OOPGradeManager {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 90, 95, 54),
                new Student("Bob", 80, 75, 67),
                new Student("Charlie", 85, 88, 100)
        };

        for (Student student : students) {
            System.out.printf("%s 평균: %.1f\n", student.name, student.getAverage());
        }
    }
}