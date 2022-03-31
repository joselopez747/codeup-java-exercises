class Dish {
    int costInCents;
    String nameOfDish;
    boolean wouldRecommend;
    static int totalDishes = 0;

    public Dish(){
        totalDishes++;
    }

    public void printSummary(){


        System.out.printf(
                "\nCost: %d \n Name: %s \n Recommended: %b \n", costInCents, nameOfDish, wouldRecommend);
    }



}


public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish();

        dish1.nameOfDish = "Dragon Roll";
        dish1.costInCents = 15000;
        dish1.wouldRecommend = true;

        dish1.printSummary();

        Dish dish2 = new Dish();

        dish2.printSummary();

        System.out.println("\nTotal Dishes: " + Dish.totalDishes);

    }

}
