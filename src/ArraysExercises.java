import java.util.Arrays;

public class ArraysExercises {
    public static Person [] addPerson(Person[] persons, Person noob){
        Person [] newBiggerArray = new Person[persons.length +1];
        for (int i = 0; i < persons.length; i += 1){
            newBiggerArray[i] = persons[i];
        }
        newBiggerArray[newBiggerArray.length-1] = noob;
        return newBiggerArray;
    }



    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);//this does not print out the array it prints a symbolic memorization of the array
        System.out.println(Arrays.toString(numbers));//this does print out the array but have to have the import class set

        Person [] persons = new Person[3];
        persons[0] = new Person ("Jose");
        persons[1] = new Person ("Erik");
        persons[2] = new Person ("Junior");

        for (Person person : persons){
            System.out.println(person.getName());
        }

        Person[] newPersonsArray = ArraysExercises.addPerson(persons, new Person("Jay"));
            for (Person person: newPersonsArray){
                person.sayHello();
            }

        }
    }

