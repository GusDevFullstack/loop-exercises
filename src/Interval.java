import java.util.Locale;
import java.util.Scanner;

public class Interval {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int count_In = 0, count_Out = 0;
		
		for (int i=0; i<x; i++) {
			int n = sc.nextInt();
			if (n >= 10 && n <=20) {
				count_In++;
			} else {
				count_Out++;
			}
		}
		
		System.out.printf("%d in\n", count_In);
		System.out.printf("%d out\n", count_Out);
		
		sc.close();
	}
}
