public class Lesson12 {
	 Person p;
	 p = new Student();
	 //static type of p is is Person!
	 p = new Dentist ("Bob"); //dynamic type will be dentist after this line

//static type is object and dynamic type is object
	 Object o;
	 o =new Person ()
	 p = (Person) o;

	 Animal a1 = Bird ();
	 //obj class name always is a var type

 }
/*
Static type: what it is at compile time

Dynamic type of variable- the type of object reference at runtime

Down casting is ok, up casting is not ok
Up casting is going up the heirarcht and can be done

Polymorphism- hvaing many forms
Allows us to deal with diverse, but related members of a group

obj.doIt()

obj can be many differnt types and we can do a bunch with import junit.framework.TestCase;

Bird is a animal

Will look for method inside dynamcic type and if method doesn't exist will look for method in each level u the hierarchy till it gets to Object

At compile time, does not know the dynamci type. SO, if there is a method that is in an dynamic object but not in the static object, than there will be an error becuase compiler doesnt see method.


This is called synamic binding -> the method which it gets bound to
*/
