// I worked on the homework assignment alone, using only course materials.
import java.util.Scanner;
import java.lang.Math;

public class TemperatureConverter {
  public static void main(String[] args) {

      Scanner scan = new Scanner (System.in);
      System.out.println("Enter a temperature in Kelvin:");
      double kelvin = scan.nextDouble();

      double farenheit = (kelvin * 1.8 - 459.67); 
      System.out.printf(kelvin + " Kelvin is %.2f degrees Farenheit", farenheit);


  }
}
