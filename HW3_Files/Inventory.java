/*
I worked on the homework assignment alone, using only course materials.
 */

public class Inventory {

    // TODO : Add an Item[] instance variable called contents.
    // Initialize it at declaration; give it a default length of 4.
	private Item [] contents = new Item[4];
	private int size = 0;
	//this.contents = contents;
    // Merge two inventorys, merging other into this inventory.
    public void merge(Inventory other) {
        // TODO : Compute contents.length + other.contents.length
		int newLength = contents.length + other.contents.length;
        // TODO : Create a new Item[] of the size above
		Item [] newItem = new Item[newLength];
        // TODO : Copy all the elements from contents into the new Item[]
		int i =0;
		for (; i<contents.length; i++) {
			newItem [i] = contents[i];
		}

        // TODO : Copy all the elements from other.contents into the new Item[]
		for (; i<newLength; i++) {
			newItem [i] = other.contents[i-contents.length];
		}
        // TODO : Set contents to be the new Item[] we just filled
		contents = newItem;
}
    // Get the i-th item, where the 0th item is the first.
    // Return null if the index is invalid.
    public Item getItem(int i) {
        // TODO : Check if "i" is a bad index into our array
            // If so, return null
		if (i< 0 || i >= contents.length) {
			return null;
		}
        // TODO : Otherwise, return the element at index i
		else {
			return contents[i];
		}
        //return null; // remove this in your final code
    }

    // Put an item at the i-th position, where the 0th item is the first.
    // Return false if the index is invalid. Otherwise return true.
    public boolean putItem(int i, Item item) {
        // TODO : Check if "i" is a bad index into our array
            // If so, return false
		if (i< 0 || i >= contents.length) {
			return false;
		}
        // TODO : Otherwise, set the element at index i to item
		else {
			contents [i] = item ;
			size++;
		}
        return true;
    }

    // Get the length of contents.
    public int getContentsLength() {
        // TODO : Return the length of contents.
		return size;
        //return -1; // remove this in your final code.
    }

}
