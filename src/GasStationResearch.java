import java.util.Locale;
import java.util.Scanner;

public class GasStationResearch {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qty = sc.nextInt();
		int i = 0;
		int alcohol = 0, gasoline = 0, diesel = 0;

		while (qty > i) {
			i++;
			int fuelType = sc.nextInt();
			switch (fuelType) {
			case 1:
				alcohol++;
				break;
			case 2:
				gasoline++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				i = qty;
				break;
			default:
				System.out.println("Please insert (1)alcohol (2)gasoline (3)diesel (4)to end the research: ");
				i--;
			}
		}
		
		System.out.println("Thank you");
		System.out.println("Alcohol: " + alcohol);
		System.out.println("Gasoline: " + gasoline);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}