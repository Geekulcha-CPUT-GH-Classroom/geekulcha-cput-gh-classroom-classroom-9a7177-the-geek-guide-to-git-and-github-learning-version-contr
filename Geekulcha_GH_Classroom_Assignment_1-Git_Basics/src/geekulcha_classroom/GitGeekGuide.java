package geekulcha_classroom;
import java.util.Scanner;
/**
 *
 * @author roris
 * @version 1.0
 * @since 2026-03-22
 * 
 */
public class GitGeekGuide {

/**
 * Entry point of the application.
 * Demonstrates user input and object interaction.
 *
 * @author Rorisang
 * @version 1.0
 */
    
    public static void main(String[] args) {
    /**
     * Main method that collects student details and prints an ID card.
     *
     * @param args command-line arguments (not used)
     */        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter firstname: ");
        String firstName = sc.nextLine();
        
        System.out.print("Enter surname: ");
        String surname = sc.nextLine();

        System.out.print("Enter initial: ");
        String initial = sc.nextLine();

        System.out.print("Enter faculty: ");
        String faculty = sc.nextLine();

        System.out.print("Enter student number: ");
        String studentNumber = sc.nextLine();

        Student student = new Student(firstName, surname, initial, faculty, studentNumber);
        StudentCard card = new StudentCard(student);

        card.displayCard();
    }
    
}
