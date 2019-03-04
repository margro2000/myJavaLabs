public class Lesson 13 {
	//change the dynamci type through casting copiles but leads to a run type error
	//interfaces are similar, but not the same as abstract classes
	//They are NOT classes -> they are contracts that provide a set of services
	//a collection of abstract methods and constants plus some more stuff

	public interface Bank {
		void deposit (double dep);
		double withdraw(double w);
		void audit();
	}

	//a class can implement an interface if it provides all of the methods of the interfaces

	public class BigBank implements Bank, DrugStore, Cleaner {
		//you can implement multiple interfaces!
		/*default implementations, static methods, and constants, be in hierarchies
must have implementation
		*/
	}

}
