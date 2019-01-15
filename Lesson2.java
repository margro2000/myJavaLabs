/*4.3-4.5
More on orepators, conversions, Start of objects, Strings
Java is strongly typed
Conversions:
  Short to long (narrowing): NONONO NOT ALLOWED DO NOT DO BAD BAD BAD
  long to short (widening): ok to do :)!
3 types of conversions:
  1) assignments
  2) arithmatic promotion
  3) casting: use paranthesis to transform one type to another

Note: you can narrow when casting because this is explicit, you can't do it implicitely such as when assigning.

OO: object oriented:

-2 types of entities in Java:
-Primatives
-objects

Java variable holds reference to an object
  OR
value of a primative type

A String is an object type. YOu have string literals and string objects.

Instantion- creating an instnace of a class:

  j.method(paramater);
Access the methods of the object through the dot operators

Strings are a special case, they behave as primatives and objects

You can have String Literals: double quotes  => "Walk the dog"

you can concatenate with the String concat +


*/
Lesson2(String nameInput) //this is my contructor.
  this.name = nameInput; //initialized the parameter


public class Lesson1 {
  public static void main(String[] args) {
    int sum, a, b, c, result;
    Sum += 12; //sum = sum +12
    result /= a+b * (c-12);

  //assignment:
    int sum = 0;
    double avg = 75;
    avg = sum; //widening
    // sum = avg NO NOT ALLOWED COMPILE TIME ERROR THIS IS NARROWING

  //arithmatic promotion:
    double result;
    result = sum/avg;  //result will be a double: avg is a double so sum is promoted to a double. 0.0/75.0.
    // if sum/avg was an int, result would be truncating ?????????????? WHAAAT ASK AFTER CLASS

  //casting
    sum = (int) avg;

    int a=5, b=2;
    double total = (double) a/b;  //equivalent to 2.5,

    total = (double) (a/b); //equivalent to 2.0

    String i;
    int val;
    j = newSring("Hello"); // newString is a construtor, "Hello" is the parameter
    val = 12;

    Lesson2 lesson2 = new Lesson2 (nameInput: "suzy") (
    lesson2.sayHello();
    )

    void sayHello() {
      System.out.println(Hello + name + !);
    }

    String a1 = "mary";
    String a2 = "jane";
    // here you have references, or pointers at two different locations which hold many and jane.

    a1 = a2; //a2 still points to Jane, but now a1 also points to Jane. The garbage collector will clean up "mary" because no one points to it anymore.

    a2 = "suzy";

    a1 = newString("..."); //this will create a new memory location 


  }
}
