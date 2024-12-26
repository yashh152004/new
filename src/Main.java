//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.Console;
import java.util.*;

class Main {
    // Declare 'name' as a class-level instance variable
     String name;
    double sal;
    double in;
    double set_value;
    double curr;
    // Method to input password and name
    void f1() {
        // Get the console object
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            return;
        }

        // Use console to read the password securely
        char[] passwordArray = console.readPassword("Enter the password: ");

        // Convert char array to string (in a real application, avoid storing passwords as strings)
        String password = new String(passwordArray);

        // Display the entered password (just for the sake of this example; avoid printing passwords in real apps)
        System.out.println("Password entered successfully.");

        // Input the name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        name = sc.nextLine(); // Assign input to the class-level variable
    }

    // Getter for the 'name' variable
    public String getName() {
        return name;
    }
     void sal() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Current bank balance");
         sal = sc.nextDouble();
     }
    void in_value()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inputed balance");
        in = sc.nextDouble();
    }
    void sal_set() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Allowance value");
         set_value= sc.nextDouble();
    }
    void curr_value() {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the set balance");

        curr=sal-in;
        if(set_value>=curr)
        {
            System.out.println("Warning--------");
        }
        System.out.println("Amount now------"+curr);
    }

    public static void main(String[] args) {
        Main wallet = new Main();
        wallet.f1(); // Call f1() to input data
        System.out.println("-------------------------");
        System.out.println();
        // Access and print the name
        System.out.println("Heyyyy " + wallet.getName());
        wallet.sal();
        wallet.in_value();
        wallet.sal_set();
        wallet.curr_value();
    }
}


