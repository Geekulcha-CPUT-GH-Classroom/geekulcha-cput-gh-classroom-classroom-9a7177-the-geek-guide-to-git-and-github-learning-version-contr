/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geekulcha_classroom;

/**
 * Represents a student with basic personal and academic details.
 * Demonstrates encapsulation in OOP.
 *
 * @author Rorisang
 * @version 1.0
 * @since 2026-03-22
 */
public class Student {
    private String firstName;
    private String surname;
    private String initial;
    private String faculty;
    private String studentNumber;

    /**
     * Constructs a new Student object.
     *
     * @param surname the student's surname
     * @param initial the student's initial
     * @param faculty the faculty the student belongs to
     * @param studentNumber the unique student number
     */
    public Student(String surname, String initial, String faculty, String studentNumber) {
        this.surname = surname;
        this.initial = initial;
        this.faculty = faculty;
        this.studentNumber = studentNumber;
    }

    /** @return the student's surname */
    public String getSurname() { return surname; }

    /** @return the student's initial */
    public String getInitial() { return initial; }

    /** @return the student's faculty */
    public String getFaculty() { return faculty; }

    /** @return the student's student number */
    public String getStudentNumber() { return studentNumber; }
}
