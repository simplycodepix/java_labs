package com.company;
import java.util.Hashtable;
import java.util.Set;

public class Utils {
    public static Subject[] generateSubjects(String[] subjectNames) {
        Subject[] subjects = new Subject[5];

        int i = 0;
        for (String subjectName : subjectNames) {
            subjects[i] = new Subject(subjectName);
            i++;
        }

        return subjects;
    }

    public static String getTheBestSubject(Student[] students) {
        Hashtable<String, Integer> subjects_hash_table = new Hashtable<String, Integer>();

        for (Student student : students) {
            Subject[] subjects = student.getSubjects();
            for (Subject subject : subjects) {
                String subjectName = subject.getName();
                if (subjects_hash_table.get(subjectName) != null) {
                    subjects_hash_table.put(subjectName, subjects_hash_table.get(subjectName) + (int)subject.getMark());
                } else {
                    subjects_hash_table.put(subjectName, (int)subject.getMark());
                }
            }
        }

        Set<String> setOfCountries = subjects_hash_table.keySet();
        String bestSubject = "";
        int maxMark = 0;
        for (String subject : setOfCountries) {
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
