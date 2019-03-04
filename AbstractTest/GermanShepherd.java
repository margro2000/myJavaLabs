public class GermanShepherd extends Dog {

	public GermanShepherd(int age, String color, double weight) {
		super(age, color, weight, true);
	}

	public void speak() {
		System.out.println("Bork. I am a german shepherd");
	}
}