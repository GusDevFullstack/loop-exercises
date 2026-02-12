import java.util.Locale;
import java.util.Scanner;

public class IncreasingOrDecreasing {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		while (number1 != number2) {
			if (number1 > number2) {
				System.out.println("Decreasing");
			} else {
				System.out.println("Increasing");
			}
			number1 = sc.nextInt();
			number2 = sc.nextInt();
		} 

		sc.close();
	}
}