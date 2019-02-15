// I worked on the homework assignment alone, using only course materials.
import java.util.Scanner;
public class NumberSequences {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char sequenceType;
		do {
			System.out.println("\nEnter the first character of the sequence to generate\n(C)ollatz, (F)ib, or (E)xit:");
			sequenceType = input.next().charAt(0);
			if (sequenceType == 'C' || sequenceType == 'c') {
				int count;
				System.out.println("Enter the starting number (1 - 100):");
				int startNum = input.nextInt();
				System.out.printf("Collatz Sequence: ");
				System.out.printf(startNum + " ");
				for (count = 0; startNum != 1; count++) {
					if (startNum % 2 == 0) {
						startNum /= 2;
					} else if (startNum % 2 == 1) {
						startNum = (startNum * 3) + 1;
					}
					System.out.printf(startNum + " ");
				}
				System.out.print("\nNumber of steps: " + count);
				System.out.println("\n--------------------");

				} else if (sequenceType == 'F' || sequenceType == 'f') {
					System.out.println("Enter the length of the desired fib sequence (1 - 40): ");
					int upperFibLimit = input.nextInt();
					int [] fibSequence = new int[upperFibLimit];
					System.out.printf("Fib Sequence: ");
					for (int count = 0; count < upperFibLimit; count++) {

						if (count == 0) {
							fibSequence[count]=0;
						} else if (count == 1) {
							fibSequence[count]=1;
						} else if (count > 1) {
							fibSequence[count] = fibSequence[count-1] + fibSequence[count-2];
						}

						System.out.printf(fibSequence[count] + " ");
					}
					System.out.println("\n--------------------");
				} else if (sequenceType == 'E' || sequenceType == 'e') {
					System.out.println("--------------------");
					break; }
					else {
						System.out.println("Invalid entry");
					}
				} while (sequenceType != 'e');

			}
		}
