// I worked on the homework assignment alone, using only course materials.
import java.util.Scanner;
import java.lang.Math;

public class TemperatureConverter {
  public static void main(String[] args) {

      Scanner scan = new Scanner (System.in);
      System.out.println("Enter a temperature in Kelvin:");
      String stringKelvin = scan.nextLine();
      double kelvin = Double.parseDouble(stringKelvin);

      double fahrenheit = (kelvin * (1.8) - 459.67);
      // System.out.printf(stringKelvin + " Kelvin is %.2f degrees Fahrenheit", fahrenheit);
      System.out.printf("%s Kelvin is %.2f degrees Fahrenheit\n", stringKelvin, fahrenheit);
  }
}
