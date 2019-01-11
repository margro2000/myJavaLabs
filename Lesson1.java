/*Notes 1/9/19
Topics: variables, expressions, and assignments.
Reach chapter 2 after class for further understanding.
Important note-
There are 3 types of Identifiers:
  1) Identifiers that are programmer defined, ex: args+jan
  2) "other" programmer defined. This is in Java that have been defined by another programmer. Ex: System.out.println
  3) Reserved words: ex- public, class, void, true.
Note: once the identifier is named, the type cannot be changed.
While you can't change the type, you can change the value of a declared variable.
Note: ava is a strongly typed language.
Note: a constant is immutable
Important note -
Types:
Integers- a whole number
  1) byte- 8 bits
  2) short- 16 buts
  3) Int- 32 bits, typically you use the int value
  4) long- 64 bits
Float- can be a decimal, there are two different float types
  1) Float- 32 bits
  2) Double- 64 bits, typically it is recommended to use a double since there is more space
Note: there are object types of each of these which are shown in uppercase, will go over later
There are literal types: 12l- makes a long, 1.3f, makes this a float. This is called type cercion, which makes the value into something it usually isn't.
Expressions: a combination of one or more operators and operands
Example operators: +, -, /, *, %
Note: %- this is modulo which gived back the remainder.
Note: use parenthesis for order of operations
Order of operations hierarchy from top to bottom:
1) ++, -- unary operations  Right to left
2) * / % --left to right
3) +, - --left to right
4) = --left to right
int x = 8- 3*4+6/2
//IMPORTANT- practice order of operations in Java for next quiz/test
You can do a += or an =+, this changes the way it is assigned.
++ :the increment operator which adds 1
--  : the decrament operator which subtracts 1
 */

public class Lesson1 {
  public static void main(String[] args) {
    int jan;
    jan =30 +1;
    System.out.println("Jan has "+jan+ " days");
    int total;
    double pi =3.141; //includes a variable declaration and assignment.
    pi = 6.875;
    total =0;
    total = total +3;
    final int MONTHS = 12; //use the keywork final to declare a constnat
    total = MONTHS + 2;
    System.out.println(total);
    boolean easy;
    boolean not = true; //note: true and false are reserved words.
    System.out.println(15%2);//prints out the remmainder.
    System.out.println(18/4 + ", "+ 18/4.0); //this returns 4, 4.5.
    System.out.println(total++);
    System.out.println(total--);


  }
}
