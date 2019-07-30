package com.Stackroute.PE5;

public class Student {

//  Private variables of a Student
    private int studentId;
    private String studentName;
    private int age;

//     Custom Constructor for declaring variables
    public Student(int studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

// **Getter and Setter Methods for assigning and retrieving Private Variables**
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
