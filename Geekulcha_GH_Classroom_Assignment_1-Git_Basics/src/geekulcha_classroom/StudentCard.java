/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geekulcha_classroom;

/**
 * ASCII representation of a student ID card.
 * Uses composition by holding a Student object.
 *
 * @author Rorisang
 * @version 1.0
 */
public class StudentCard {
    private Student student;

    /**
     * Constructs a StudentCard for the given student.
     *
     * @param student the student whose details will be displayed
     */
    public StudentCard(Student student) {
        this.student = student;
    }

    /**
     * Displays the ASCII student ID card in the terminal.
     */
    public void displayCard() {
        System.out.println("=====================================");
        System.out.println("|          STUDENT ID CARD          |");
        System.out.println("=====================================");
        System.out.println("| [ :) ]                            |"); // Face placeholder
        System.out.println("| Name: " + String.format("%-28s", student.getInitial() + ". " + student.getSurname() + " "+ student.getFirstName())+"|");
        System.out.println("| Faculty: " + String.format("%-25s", student.getFaculty()) + "|");
        System.out.println("| Student No: " + String.format("%-22s", student.getStudentNumber()) + "|");
        System.out.println("=====================================");
    }

}

