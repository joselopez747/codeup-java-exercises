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

//    public static int getInteger(int min, int max){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number between " + min + " and " + max);
//        int userInput = sc.nextInt();
//
//        //this starts the loop
//        if (userInput < min || userInput > max) {
//            System.out.println("Number is out of range");
//            return getInteger(min, max);
//        } else {
//
//        //this stops the loop
//            System.out.println("Number is in range");
//            return userInput;
//        }
//    }




    //Method Exercise 3
//    Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//
//    Factorials are denoted by the exclamation point (n!). Ex:
// 1! = 1               = 1
// 2! = 1 x 2           = 2
// 3! = 1 x 2 x 3       = 6
// 4! = 1 x 2 x 3 x 4   = 24




    public static void main(String[] args) {
        System.out.println(getInteger(1, 10));
    }
}
