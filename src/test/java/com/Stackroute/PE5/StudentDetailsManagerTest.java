
package com.Stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentDetailsManagerTest {

    StudentDetailsManager studentDetailsManager;

    @Before
    public void setUp() throws Exception {
        studentDetailsManager = new StudentDetailsManager();
    }

    @After
    public void tearDown() throws Exception {
        studentDetailsManager = null;
    }

    /**
     * Test - getStudentsSortedList()
     * Given StudentManager list containing various values, method should return the sorted list.
     */
    @Test
    public void givenStudentsListShouldReturnSortedList() {
        List<Student> inputList=new ArrayList<>();
        Student student1 = new Student(1, "Ajay", 27);
        Student student2 = new Student(2, "Sneha", 23);
        Student student3 = new Student(3, "Simran", 37);
        Student student4 = new Student(4, "Ajith", 22);
        Student student5 = new Student(5, "Vijay", 29);
        inputList.add(student1);
        inputList.add(student2);
        inputList.add(student3);
        inputList.add(student4);
        inputList.add(student5);
        List<Student> expectedSortedList = new ArrayList<>();
        expectedSortedList.add(student4);
        expectedSortedList.add(student2);
        expectedSortedList.add(student1);
        expectedSortedList.add(student5);
        expectedSortedList.add(student3);
        assertEquals("givenStudentsListShouldReturnSortedList: check getStudentsSortedList().",
                expectedSortedList,  studentDetailsManager.managingStudentDetails(inputList));
    }

    /**
     * Test - getStudentsSortedList()
     * Given StudentManager list containing similar ages, method should return the sorted list.
     */
    @Test
    public void givenStudentsListWithSameAgesShouldReturnSortedList() {
        List<Student> inputList=new ArrayList<>();
        Student student1 = new Student(1, "Ajay", 29);
        Student student2 = new Student(2, "Sneha", 23);
        Student student3 = new Student(3, "Simran", 37);
        Student student4 = new Student(4, "Ajith", 23);
        Student student5 = new Student(5, "Vijay", 29);
        inputList.add(student1);
        inputList.add(student2);
        inputList.add(student3);
        inputList.add(student4);
        inputList.add(student5);
        List<Student> expectedSortedList = new ArrayList<>();
        expectedSortedList.add(student4);
        expectedSortedList.add(student2);
        expectedSortedList.add(student1);
        expectedSortedList.add(student5);
        expectedSortedList.add(student3);
        assertEquals("givenStudentsListShouldReturnSortedList: check getStudentsSortedList().",
                expectedSortedList, studentDetailsManager.managingStudentDetails(inputList));
    }

    /**
     * Test - getStudentsSortedList()
     * Given StudentManager list containing various values, method should return the sorted list.
     */
    @Test
    public void givenStudentsListWithShouldReturnSortedList() {
        List<Student> inputList=new ArrayList<>();

        Student student1 = new Student(1, "Ajay", 27);
        Student student2 = new Student(2, "Ajay", 27);
        Student student3 = new Student(3, "Ajay", 27);
        Student student4 = new Student(4, "Ajay", 27);
        Student student5 = new Student(5, "Sneha", 27);
        inputList.add(student1);
        inputList.add(student2);
        inputList.add(student3);
        inputList.add(student4);
        inputList.add(student5);
        List<Student> expectedSortedList = new ArrayList<>();
        expectedSortedList.add(student1);
        expectedSortedList.add(student2);
        expectedSortedList.add(student3);
        expectedSortedList.add(student4);
        expectedSortedList.add(student5);
        assertEquals("givenStudentsListShouldReturnSortedList: check getStudentsSortedList().",
                expectedSortedList, studentDetailsManager.managingStudentDetails(inputList));
    }
}