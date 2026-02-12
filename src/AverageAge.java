import java.util.Locale;
import java.util.Scanner;

public class AverageAge {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		int sum = 0, i = 0;
		double averageAge;

		while (age > 0) {
			sum += age;
			i++;
			age = sc.nextInt();
		}

		if (i > 0) {
			averageAge = (double) sum / i;
			System.out.printf("%.2f\n", averageAge);
		} else {
			System.out.println("Impossible to calculate!");
		}

		sc.close();
	}
}
