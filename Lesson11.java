public class Lesson11 {
	public static void main (String [] args) {
		private static final int boolean
		/*JGRASP -> use debug mode*/
			DEBUG = true;
		if (DEBUG) {
		 	//System print...
		}
		/*testing each class and each method

		Debug: methods
		-reproduce error, simplify, divide and concur,what the program should be doing, look at details, make sure you understand the bug and what caused it
		*/

		//Inheritance: derive a new class from an existing one Automatically contains all public methods methods and data. Can add its own methods and data
		/*keyword: extends
		-is-a
		parent can't access data or methods of child
		PROTECTED: can be accessed by a child class but not outsiders
		keyword: super- gives access to the parent. like the this keyword but for parents
		Common use: to inverse parent's contructors
		java has single Inheritance

		*/
	}

	public class Person {
		protected String name;
		public Person(String n) {
			this.name = n;
		}
	}

	public class Student extends Person {
		protected int y;
		public Student (String n, int y);
		super(n);
		yr = y;
	}

//these classes are in their own file
	public class Dentist extends Person {
		protected String degree;
		public Dentist (String n) {
			degree = "dds";
		}
		//will automatically make super call to its parent and insert no-arg constructor Super ();
		//person needs a default no arg constructor because super () is inserted but theres is no default in Person- compile error
	}

	class Vehicle {
		protected int wheels;
		protected void go ()  {

		}
	}

	class Car extends Vehicle {
		private void drive {
		}
		x = wheels;
		go();// don't need qualifier- vehicle.go

	}
}
