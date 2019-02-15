/*
I worked on the homework assignment alone, using only course materials.
 */

import java.util.Random;

public class Item {

    /*
     * The Random instance to be used to acquire random values. You must use
     * this to get Random values if you want any credit!
     */
    private static Random random = new Random();

    // A String instance variable called "name"
    private String name;

    // TODO : Add a double instance variable called "price"
	private double price;

    // TODO : Add a double instance variable called "weight"
	private double weight;

    // Create an Item called "Random item" with a random price and weight.
    public Item() {
        name = "Random item";
        // TODO : Use one call to random to set price to a random double
		price = 10.0 + random.nextDouble()*90.0;
        // TODO : Use one call to random to set weight to a random double
		weight = 10.0 + random.nextDouble()*90.0;
        // Both these doubles should have a value in the range [10, 100)
    }

    // Create an Item with the given name, price and weight.
    public Item(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // Get the item name.
    public String getName() {
        return name;
    }

    // Get the item weight.
    public double getWeight() {
        return weight;
    }

    // Get the item price.
    public double getPrice() {
        return price;
    }

}
