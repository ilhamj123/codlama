package week01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Enter your name: ");
// Read the user's input
        String Name = scanner.nextLine();
// Print the name
    System.out.println("Hello, " + Name);
scanner.close();
    }
}
