/*I worked on the homework assignment alone, using only course materials.*/

/**
* This class is a Drink
* @author Margarita Groisman
* @version 1.0
*/


public class Cup {
    private Drink drink;
    private final String stamp = "Starbucks";

        /**
* This method sets drink
* @param drink object
*/
    public void setDrink(Drink drink) {
        this.drink = drink;
    }
    /**
* This method gets drink
* @return drink
*/
    public Drink getDrink() {
        return this.drink;
    }
    /**
* This method gets stamp
* @return dollar sales
*/
    public String getStamp() {
        return this.stamp;
    }
    /**
* This method takes in inputs
* @param cup1 Cup
* @param cup2 Cup
* @return dollar true or false
*/
    public boolean equals(Cup cup1, Cup cup2) {
        if (cup1.drink == cup2.drink && cup1.stamp == cup2.stamp) {
            return true;
        } else {
            return false;
        }
    }

    /**
* This method returns string
* @return my string
*/
    public String toString() {
        String returnString = "A cup of " + drink.getName() + " from " + stamp;
        return returnString;
    }

    /**
* This method takes in two first number
* @param drink object
* @param stamp string
*/
    public Cup(Drink drink, String stamp) {
        this.drink = drink;
    }

}
