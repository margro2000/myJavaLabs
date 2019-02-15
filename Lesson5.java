import java.util.Scanner;


//what does the seed value do for random?

//for trig functions in math class, it is radians NOT degrees
public class Lesson5 {
  public static void main(String[] args) {
 enum ClassYear { //enum is user defined where all possible types are listed out
   fr,
   so,
   jr,
   sr,
   UNK
 }

 ClassYear myYr = ClassYear.UNK;
 System.out.println(myYr.name());
}
}
