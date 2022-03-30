import java.util.Scanner;

public class MethodsExercises {

// Create a class named MethodsExercises. Inside of your class, write code to create the specified methods. Test your code by creating a main method and calling each of the methods you've created.
//
// Basic Arithmetic
//
// Create four separate methods. Each will perform an arithmetic operation:
//  Addition
//  Subtraction
//  Multiplication
//  Division
//
// Each function needs to take two parameters/arguments so that the operation can be performed.
//
// Test your methods and verify the output.
//
// Add a modulus method that finds the modulus of two numbers.
//
// Food for thought: What happens if we try to divide by zero? What should happen?

    public static int addition (int x, int y){
        return x + y;
    }

    public static int subtraction (int x, int y){
        return x - y;
    }

    public static int multiplication (int x, int y){
        return x * y;
    }

    public static int division (int x, int y){
        return x / y;
    }

    public static int modulus (int x, int y){
        return x % y;
    }



    // Methods Exercise 2
    // create a method that validates that user input is in a certain range.

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = sc.nextInt();

        //this starts the loop
        if (userInput < min || userInput > max) {
            System.out.println("Number is out of range");
            return getInteger(min, max);
        } else {

        //this stops the loop
            System.out.println("Number is in range");
            return userInput;
        }
    }



    public static void main(String[] args) {
        System.out.println(getInteger(1, 10));
    }
}
