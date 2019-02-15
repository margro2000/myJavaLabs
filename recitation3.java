/*
.equals vd ==:
.equals compares content (shouln't be used on primatives, onl on raw data types- use for String- a reference type)
==, compares if they are the exact same object (use on the 8 primative reference type, byte, short, int, long, boolean, double, and float)

Short Circuiting:
If you have argument and first argument is false, it won't read the second one.
Won'e even consider second argument, based on and or, only reads first expression first.

Ternary expression is like an if except its an expression, not a statement.:
If true, else false. However, it returns a statement.


.
*/

public class recitation1 {
  public static void main(String[] args) {
    System.out.println('a' == 97);// this prints true because a's number is 97
    //PRECEDENCE: Not -> AND -> OR

    int num1 = 5;
    int num2 = 10;

    int min = num1 < num2 ? num1 : num2;

    //what happens with switch errors

    if (newScan.hasNext()) {
      char input.next().charAt(0);

      switch(input) {
        case 'A':
        System.out.println("Well done");
        break; // if you don't include break, it will print all statements!!

        case 'C':
        System.out.println("You passed");
        break;

        // if you don't have curly braces in java, it will only look at line directly after.

        if (2==2)
          System.out.println("1");
        System.out.println("2");

        //for for loops, you can leave one of the statements empty as long as there is a semi-colan

        // do while will always perform at least once,a nd then check condition. This is useful in sme cases. While checks case first so it mayn just never return

        

      }
    }


  }
}
