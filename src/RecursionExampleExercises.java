public class RecursionExampleExercises {

    // TODO: use recursion to print out a given number up through 100
     public static void countTo100(int num) {
         System.out.println(num);
         if (num == 100){
             return;
         }
         countTo100(num + 1);
     }




    // TODO: use recursion to add all numbers up from 1 to a given number
     public static int addNums(int num) {
     if (num == 1) {
         return 1;
     }
     return num + addNums(num - 1);
     }

    public static void main(String[] args) {
        countTo100(1);
    }
}
