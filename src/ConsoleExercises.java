import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {


//        //Exercise 1
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.\n", pi);


//Instructor answer
        //double pi = 3.14159
        //String output = String.format("The value of pi is approximately %.2f.", pi)
        //System.out.println(output);


//
//        //Explore the Scanner class
//        //Exercise 1
        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter an number:");
//        int num = sc.nextInt();
//        System.out.println(num);

//Instructor Answer


//
//        //Exercise 2
//        System.out.print("Please enter your first, middle and last name.");
//        String first = sc.next();
//        String middle = sc.next();
//        String last = sc.next();
//
//        System.out.println(first);
//        System.out.println(middle);
//        System.out.println(last);


        //Exercise 3 and 4
//        System.out.print("Please enter your favorite quote:");
////        String quote = sc.next();
//        String quote = sc.nextLine();
//        System.out.println(quote);



        //calculate the perimeter and are of Codeup's Classrooms.
        //Exercise 1

        System.out.println("Enter the length: ");
        String lengthInput = sc.nextLine();
        System.out.println("Enter the Width: ");
        String widthInput = sc.nextLine();

        float length = Float.parseFloat(lengthInput);
        float width = Float.parseFloat(widthInput);
        System.out.println("The are is: " + (length * width) + ".");
        System.out.println("The perimeter is: " + (length * 2 + width *2) + ".");





    }
}
