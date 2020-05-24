package com.company;
import java.util.Hashtable;
import java.util.Set;

public class Utils {
    public static Student.Subject[] generateSubjects() {
        Student.Subject[] subjects = new Student.Subject[5];

        subjects[0] = new Student.Subject(SubjectEnum.JAVA);
        subjects[1] = new Student.Subject(SubjectEnum.TPPS);
        subjects[2] = new Student.Subject(SubjectEnum.DB);
        subjects[3] = new Student.Subject(SubjectEnum.LAN);
        subjects[4] = new Student.Subject(SubjectEnum.WEB);

        return subjects;
    }

    public static SubjectEnum getTheBestSubject(Student[] students) {
        Hashtable<SubjectEnum, Integer> subjects_hash_table = new Hashtable<SubjectEnum, Integer>();

        for (Student student : students) {
            Student.Subject[] subjects = student.getSubjects();
            for (Student.Subject subject : subjects) {
                SubjectEnum subjectName = subject.getName();
                if (subjects_hash_table.get(subjectName) != null) {
                    subjects_hash_table.put(subjectName, subjects_hash_table.get(subjectName) + (int)subject.getMark());
                } else {
                    subjects_hash_table.put(subjectName, (int)subject.getMark());
                }
            }
        }

        Set<SubjectEnum> setOfCountries = subjects_hash_table.keySet();
        SubjectEnum bestSubject = SubjectEnum.JAVA;
        int maxMark = 0;
        for (SubjectEnum subject : setOfCountries) {
            int mark = subjects_hash_table.get(subject);
            if (maxMark < mark) {
                maxMark = mark;
                bestSubject = subject;
            }
        }

        return bestSubject;
    }

    public static String getTheBestStudent(Student[] students) {
        Student student = students[0];

        for (Student one : students) {
            if (student.getAverageMark() < one.getAverageMark()) {
                student = one;
            }
        }

        return student.getName();
    }

    public static int getRandomInteger(int max, int min) {
        return ((int) (Math.random() * (max + 1 - min))) + min;
    }
}
