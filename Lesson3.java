/*homework hint: you can convert from string to a double usine xx method
look at piazza to understand better
Strings are immutable and store reference locations
1)System is a CLASS
2)out is an object
3)printLn is a method

print vs println: println

escape sequence: '\': backslash- reference book

The printf method allows you to format output.
It is better practice to put nextLine instead of nextInt and then have the program convert the code so that the code isn't prone to errors

*/
public class Lesson1 {
  public static void main(String[] args) {
    double price;
    String name;
    int day;
    System.out.printf("It's %6.2f for %s on %d\n", price, name, day);
    //%6.2f -> float that has a min of six characters (including the .), 2 indicated that there are 2 slots to the right of the decimal point. THis is right-justified.
    //the negative sign left-aligns

  }
}
