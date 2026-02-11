import java.util.Locale;
import java.util.Scanner;

public class Password {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int passWord = sc.nextInt();
		
		while (passWord != 2002) {
			System.out.println("Wrong password! Try again.");
			passWord = sc.nextInt();
		}
		
		System.out.println("Access allowed");
		
		sc.close();
	}
}