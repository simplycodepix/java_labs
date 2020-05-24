package com.company;

public class Student {
    private int id;
    private static int nextId;
    private String firstName;
    private String lastName;
    private String group;
    private Subject[] subjects;

    public Student(String firstName, String lastName, String group, Subject[] subjects) {
        this.setName(firstName, lastName);
        this.setGroup(group);
        this.setSubjects(subjects);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public String getGroup() {
        return group;
    }

    public float getAverageMark() {
        float average = 0;
        for (Subject subject : this.subjects) {
            average += subject.getMark();
        }
        return average / this.subjects.length;
    }

    public String getScholarship() {
        float averageMark = this.getAverageMark();
        return averageMark == 5 ? "Increased Scholarship" : averageMark >= 4 && averageMark <= 4.9 ? "Regular Scholarship" : "No Scholarship";
    }

    public void getMarks() {
        P.println("\nMarks: ");
        for (Subject subject: this.subjects) {
            P.println(subject.getName() + ": " + subject.getMark());
            String passed = subject.passed ? "passed" : "failed";
            P.println(subject.getName() + ": " + passed);
        }
    }

    public void getStudentStats() {
        P.println("\nStudent: " + this.getName());
        this.getMarks();
        P.println("Average mark: " + this.getAverageMark());
        P.println("Scholarship: " + this.getScholarship());
    }
}
