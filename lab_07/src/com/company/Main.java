package com.company;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Name 1", "Last 5", "KB-71", Utils.generateSubjects());
        students[1] = new Student("Name 2", "Last 4", "KB-71", Utils.generateSubjects());
        students[2] = new Student("Name 3", "Last 3", "KB-71", Utils.generateSubjects());
        students[3] = new Student("Name 4", "Last 2", "KB-71", Utils.generateSubjects());
        students[4] = new Student("Name 5", "Last 1", "KB-71", Utils.generateSubjects());

        SubjectEnum bestSubject = Utils.getTheBestSubject(students);
        String bestStudent = Utils.getTheBestStudent(students);

        P.println("Best subject: " + bestSubject);
        P.println("Best student: " + bestStudent);

        for (Student student : students) {
            student.getStudentStats();
        }
    }
}
