public class ControlFlowExercises {
    public static void main(String[] args) {


//Exercise 1a
// Loop Basics
//
//While loop
//   Create an integer variable i with a value of 5.
//        int i = 5;
//   Create a while loop that runs so long as i is less than or equal to 15
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//   Each loop iteration, output the current value of i, then increment i by one.
//i++ does the increment
//   Your output should look like this:
//
//    5 6 7 8 9 10 11 12 13 14 15


//Exercise 1b
//Do While Loop
//    Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//    int byTwos = 0;
//    do {
//        System.out.println(byTwos);
//        byTwos += 2;
//    } while(byTwos <= 100);

//    Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

//    Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

//        int i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i <= 10000);




//Exercise 1c
//For loop
//Refactor the previous two exercises to use a for loop instead.

//        for (int byTwos = 0; byTwos <= 100; byTwos += 2){
//            System.out.println(byTwos);
//        }


//        for (int i = 2; i <= 10000; i = i * i) {
//            System.out.println(i);
//        }



    }
}