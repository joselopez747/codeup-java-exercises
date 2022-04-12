import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionsStudyTest {
    public static void main(String[] args) {
        ExceptionsStudy exceptionsStudy = new ExceptionsStudy();
        exceptionsStudy.askForAnInteger();

////        try {
////            ExceptionsStudy study = new ExceptionsStudy();
////            System.out.println(Integer.parseInt(study.maybeAnInteger));
////            System.out.println(Integer.parseInt(study.certainlyNotAnInteger));
////        } catch (NumberFormatException nfx) {
////            System.out.println("Got an exception" + nfx);
////            System.out.println(nfx.getMessage());
////        }
//
//        try {
//            String myTestString = "This is my test string";
//            int myStringsLength = myTestString.length();
//            System.out.println(myStringsLength);;
//            String mySubString = myTestString.substring(4,24);
//            System.out.println(mySubString);
//
//        } catch (IndexOutOfBoundsException iobx){
//            System.out.println("Index out of bounds exception!!!!" + iobx);
//        }
//        public void subListMaker(String sentence){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter an integer");
//            int firstInt = scanner.nextInt();
//            System.out.println("Please enter another integer");
//            int secondInt = scanner.nextInt();
//            System.out.println(sentence);
//            ArrayList<String> wordArrayList = new ArrayList<String>();
//            String[] stringArray = sentence.split(" ");
//            for (String word : stringArray){
//                wordArrayList.add(word);
//            }
//            List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
//            String newSentence = String.join(" ", shorterList);
//            System.out.println(newSentence);
//        }

    }
}
