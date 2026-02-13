import java.util.Locale;
import java.util.Scanner;

public class WeightedAverage {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
				double number1 = sc.nextDouble();
				double number2 = sc.nextDouble();
				double number3 = sc.nextDouble();
				double weightedAverage = (number1 * 2 + number2 * 3 + number3 * 5) / 10;
				System.out.printf("%.1f\n", weightedAverage);
		}

		sc.close();
	}

}