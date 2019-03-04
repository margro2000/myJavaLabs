public class Dog extends Animal {
	boolean hasPointyEars;

	public Dog(int age, String color, double weight) {
		super(age, color, weight);
	}
	public Dog(int age, String color, double weight, boolean hasPointyEars) {
		super(age, color, weight);
		this.hasPointyEars = hasPointyEars;
	}

	public void speak() {
		System.out.println("Woof");
	}
	public boolean hasPointyEars() {
		return this.hasPointyEars;
	}
}