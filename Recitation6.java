public class Lesson9 {
	  //identifier of method is just its name and parameters

	  private String name;
	  private int year;//if you dont put static explicitely its an instance field

	  private static int numStudents;
	  public String favoriteMonth(String name) {
		  return name;
	  }

	  /*
	  with method overloading, its the parameter types, not names that have to be different

	  Java will provide the default no arg constructors if none have been written in
	  A constructor is not a method and does not have a return type

	  .equals uses == if you dont give it your own custom way. it will return false for 2 strings with the same vals
	  null is the lack of an object.
	  */

	  //my constructors: they go from least to most general

	  public Lesson9 (String name, int year) {
		  this.name = name;
		  this.year = year;
	  }

	  public Student (String name) {
		  this(name, 1);//THE FIRST LINE IN A CONSTRUCTOR MUST BE THE THIS CALL

	  }

	  public static void addStudent () {
		  numStudents++;
		  // year = 1; //YOIU CANT DO THIS BECAUSE YOU CANT ACCESS NON_STATIC FIELS
		  //study () //this doenst work because you cant call a non-static method froma  static mehtod
	  }

	  public void study () {
		  numStudents++; //this works because non-static methods CAN modify static vars
	  }

	  Student.addStudent();
	  addStudent();//this does the same hting as above because we are within the class

	  public static void main (String [] args) {
		  Student s1 = new Student("Saira", 1);
		  System.out.println(s1.numStudents);

		  s2.numStudents = 10;
		  s1.numStudents; //s1 is now 10, numStudents stay the same
	  }

	  //if its static, it is independent of any instance and unchanging
	  //it is shared across all the different fields
}


public class Dog {

	private String name;
	private String furColor;

	public Dog (String name, String furColor) {
		this.name = name;
		this.furColor = furColor;
		numDogs++;
	}
	public Dog () {
		this("Spike", "green"); //this is constructor chaining
	}

	public void howManyDogs() {
		System.out.println(name, numDogs);
	}

	public String toString(String) {
		return "djfbndnb";
	}
}
