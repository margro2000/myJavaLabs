public class Car {
protected int year;
protected String maker;

public Car(String m, int y) {
year = y;
maker = m;
System.out.println("Car");
}
public Car() {
this("unknown", 2017);
System.out.println("Car - none");
}
public String toString() {
return "I'm a "+maker+" Car -" + year;
}

public static void main(String[] args) {
Car c = new Car();
System.out.println(c);
StringTokenizer st = new StringTokenizer("This is a test");
System.out.print(st.nextToken());
//Roadster r = new Roadster("Maserati", 2009, 450);
//System.out.println(r);
}
}//end Car
