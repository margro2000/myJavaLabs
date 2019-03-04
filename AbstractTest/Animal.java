public abstract class Animal () {
	int age;
	String color;
	double height;

	public Animal(int age, String color, double weight) {
		this.age = age;
		this.color = color;
		this.weight = weight;
	}
	public abstract void speak();

	public int getAge() {
		return this.age;
	}
	public String getColor() {
		return this.color;
	}
	public double getWeight() {
		return this.weight;
	}
}
