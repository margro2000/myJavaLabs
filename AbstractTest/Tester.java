public class Tester {
	public static void main(String[] args) {
	//Is this allowed?
	Animal a1 = new Dog(6, "blue", 80.0);
	Dog d1 = new Dog(6, "blue", 80.0);
	d1.speak();
	//which speak will d1 call?
	GermanShepherd g1 = new GermanShepherd(10, "brown", 100.0);
	g1.speak();
	//which speak will g1 call?
	Dog d2 = new GermanShepherd(9, "brown", 90.0);
	d2.speak(); //which speak will d2 call?
	String dogColor = d2.getColor();System.out.println(dogColor);
	//why can we call this?
}
}
