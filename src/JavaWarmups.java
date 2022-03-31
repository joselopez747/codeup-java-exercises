import java.util.Locale;

public class JavaWarmups {
//================================= 31 March WARM UP
//Create a Java class, JavaWarmups. Add a main method to test the warmup methods.
//
//Create a method, returnFirstCapitalLetter, that takes in a string and returns the first capital letter as a char. If no capital letter is found, return a single space character ' '. Assume only letters in the input string and all possible inputs will have at least one letter.

    public static void returnFirstCapitalLetter(String s){
        for (int i = 0; i < s.length(); i++){
            if (s == s.toUpperCase()){
                return s[i].toUpperCase();
            }
        }
    }

//
//Examples...
//returnFirstCapitalLetter("hellO") // returns 'O'
//returnFirstCapitalLetter("hello") // returns ' '
//returnFirstCapitalLetter("hEllo") // returns 'E'
//returnFirstCapitalLetter("hELlO") // returns 'E'
//returnFirstCapitalLetter("H") // returns 'H'
    public static void main(String[] args) {
returnFirstCapitalLetter("Jose");
    }
}
