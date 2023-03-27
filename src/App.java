import java.util.Scanner;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
    
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}
