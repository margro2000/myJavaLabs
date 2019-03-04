/*I worked on the homework assignment alone, using only course materials.*/

/**
* This class is a Drink
* @author Margarita Groisman
* @version 1.0
*/
public enum Drink {
    CHOCOLATE("hot chocolate", 1.50), COFFEE("coffee", 2.00), TEA("tea", 1.00), EMPTY("nothing", 0.00);
    private String name;
    private double price;
    Drink() {
    }

        /**
* This method is a constructor
* @param name String
* @param price double
*/
    private Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

        /**
* This method getsName
* @return name
*/
    public String getName() {
        return this.name;
    }

            /**
* This method gets price
* @return price
*/
    public double getPrice() {
        return this.price;
    }
        /**
* This method sets price
*/
    public void setPrice() {
        this.price = price;
    }
}
