// Scanner class to take input from the user
import java.util.Scanner;
import java.util.Date;
/**
 * This is a simple Java program that demonstrates basic syntax,
 * input/output operations, and the use of comments.
 */

public class Program {
  public static void main(String[] args) {
    /**
     * This is a documentation comment.
     * This is my first Java program.
     * This will print 'Hello World' as the output
     * This is an example of multi-line comments.
    */

    // Print text
    System.out.println("Hello World!");

    // Print a number
    System.out.println(42);

    char unicode = '\u0024';
    // Print a character
    System.out.println(unicode); // This will print a dollar sign character

    // Create a Scanner object to read input
    Scanner scanner = new Scanner(System.in);
    // Prompt the user for input
    System.out.print("Enter your name: ");
    // Read user input
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    // Print a greeting message
    System.out.println("Hello, My name is " + name + "!");
    System.out.println("I am " + age + " years old.");

    // Date and time
    Date date = new Date();
    System.out.println("Current date and time: " + date.toString());

    scanner.close(); // Close the scanner to prevent resource leaks
    // This is the end of the program
    System.out.println("End of program.");
  }
}