import java.util.Locale;
import java.util.Scanner;

public class TemperatureConversor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char answer;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double tempCelsius = sc.nextDouble();
			double tempFahrenheit = 9.0 * tempCelsius / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit = %.1f\n", tempFahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			answer = sc.next().charAt(0);
		} while (answer == 's');

		sc.close();
	}
}
