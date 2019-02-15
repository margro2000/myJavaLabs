public class Lesson5 {
  public static void main(String[] args) {
	  //objects and holding references
	  //run time exception if you dont have main method
	  //methods can be an instance method- must have an object instance to call this method because it needs to have access to instance data
	  //static- a special kind of method where do you dont have to have an isntance- you can call other isntance methods
	  //method overloading- if the signitures are different you can still have the same name but different parameters.
	  //for primative types the actual value get passed int
	  // for object types the reference gets passed in

	  }

	  Car car1= new Car ();
	  car1.year;//accessing the year
	  car1.drive();

	  public Car () {
		  year =10;
		  public double drive (int time) {
			  double distance = time * speed;
			  return distance;
		  }
	  }


  }
}
