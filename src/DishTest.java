class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    //Default # of dishes
    private static int totalDishes = 0;

    public Dish() {
        //so much logic!!!!!
        totalDishes++;
    }

    //this is the constructor
    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this();
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public static int getTotalDishes() {
        return totalDishes;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void isWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public static void setTotalDishes(int totalDishes) {
        Dish.totalDishes = totalDishes;
    }


//
//    // getters and setters
//    public int getCostInCents(){
//        return costInCents;
//    }
//    public void setCostInCents(int costInCents){
//        this.costInCents = costInCents;
//    }
//
//
//    public String getNameOfDish(){
//        return nameOfDish;
//    }
//    public void setNameOfDish(String nameOfDish){
//        this.nameOfDish = nameOfDish;
//    }
//
//
//    public boolean isWouldRecommend(){
//        return wouldRecommend;
//    }
//    public void setWouldRecommend(boolean wouldRecommend){
//        this.wouldRecommend = wouldRecommend;
//    }
//
//    public Dish (int totalDishes){
//        return totalDishes;
//    }
//    public void Dish (int totalDishes){
//        this.totalDishes = totalDishes;
//    }
//
//




    public void printSummary(){
        System.out.printf(
                "\nCost: %d \n Name: %s \n Recommended: %b \n", costInCents, nameOfDish, wouldRecommend);

    }
}
//
//
public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish(1500, "Dragon Roll", true);
        Dish dish2 = new Dish(2500, "Rainbow Roll", true);
        Dish dish3 = new Dish(3500, "Sushi roll", false);
        System.out.println(Dish.getTotalDishes());

    }
}