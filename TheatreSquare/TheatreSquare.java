import java.util.Scanner;

public class TheatreSquare {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		long m = scanner.nextInt();
		long n = scanner.nextInt();
		long a = scanner.nextInt();
		System.out.print('\n');
		m = ((m % a == 0) ? 0 : 1) + m / a;
		n = ((n % a == 0) ? 0 : 1) + n / a;
		System.out.println(m * n);
	}
}