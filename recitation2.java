/*
Variables:
declaration- declare data type
assignment: int =5;
initializing: give a value to an already declared value;
If you haven't initialized a variable before trying to use it, will cause an error.
Convention for anming variabls is to use camel case
Primative- a type defined in the programming language, start with lowercase letters
long l = 10L: you should include an L at the end to show that it is a long.
float f = 10.0f - you need to assign f at the end, or there will be error.
If you need to narrow, you need to explicitely cast. When widening, it cna be done implicitely.
Know order of operations
Objects are defined by the programmable. They hold a reference, rather than the object itself.
== means are they in the same location in memory
= means do they hold the same values
Java documentation shows all the the classes provided and adds methods and return types.
indexOf, concat, length, etc


*/
public class recitation1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int z=1;
    System.out.println(++z); //changes z then prints
    System.out.println(z++); //prints then changes

    //String line = input.nextLine();
    //int age=Integer.parseInt;

    //Scanner reads input as a continous string.

    //In order to parse a double:
    //Doublr.paseDouble
    //Double.toString(d)
    //d + ""
    //to avoid exceptions, you can chack with:
    //input.hasNextInt();


  }
}
