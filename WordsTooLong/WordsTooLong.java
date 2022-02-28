import java.util.Scanner;

public class WordsTooLong {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			String w = scanner.next();
			if (w.length() > 10)
				System.out.println(w.charAt(0) + "" + (w.length() - 2) + "" + w.charAt(w.length() - 1));
			else
				System.out.println(w);
		}
	}
}