/*I worked on the homework assignment alone, using only course materials.*/

/**
* This class is a Drink
* @author Margarita Groisman
* @version 1.0
*/

public class CoffeeMachine {
    private static int cupsUsed;
    private static double sales;
    private static Cup[] cups = new Cup[10];

    /**
* This method takes in two ints and returns their sum
* @return number of cups used
*/
    public static int numCups() {
        return cupsUsed;
    }

    /**
* This method takes in two first number
* @param drink object
* @return dollar sales
*/
    public static double sales(Drink drink) {
        sales = cupsUsed * drink.getPrice();
        return sales;
    }

    /**
* This method takes in two ints and returns their sum
*/
    public static void stat() {
        String printStatement = "Today we made " + sales + " and used " + cupsUsed;
    }
        /**
* This method pours cup
* @param cup Cup
* @param drink Drink
* @return cup object
*/
    public static Cup pour(Cup cup, Drink drink) {
        if (cup != null) {
            cup.setDrink(drink);
            return cup;
        } else if (cup == null) { //fix this so it takes the last one thats not empty
            if (cups[0] == null) {
                for (int i = 0; i < cups.length; i++) {
                    cups[i] = new Cup(drink, "Java");
                }
            } else if (cups[0] != null) {
                cup = cups[0];
            }
        }
        cup.setDrink(drink);
        return cup;
    }
}
