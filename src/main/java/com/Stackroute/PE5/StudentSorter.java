package com.Stackroute.PE5;

import java.util.Comparator;

//Student Sorter class implements Comparator of type Student
public class StudentSorter implements Comparator<Student> {

//    Overidden method of compare which is in Comparator Interface
    @Override
    public int compare(Student student1, Student student2) {
//        Checking whether age is equal
        if ((student1.getAge()-student2.getAge())==0){
            //        Checking whether Names is same
            if ((student1.getStudentName().compareTo(student2.getStudentName())) == 0) {

//                If same compare Ids
                    return (student1.getStudentId()-student2.getStudentId());
                }
                else return (student1.getStudentName().compareTo(student2.getStudentName()));

        }
        else return (student1.getAge()-student2.getAge());

    }
}
