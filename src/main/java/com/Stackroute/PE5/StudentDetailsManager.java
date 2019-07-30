package com.Stackroute.PE5;

import java.util.Collections;
import java.util.List;

//  Class for Test Interface
public class StudentDetailsManager {
//    Student Sorter object for sorting the order in which Comparator
    private StudentSorter studentSorter=new StudentSorter();

//    Sortng the input List of Students with custom Comparator through Collections
    public List<Student> managingStudentDetails(List<Student> studentList){
        Collections.sort(studentList,studentSorter);
        return studentList;

    }
}
