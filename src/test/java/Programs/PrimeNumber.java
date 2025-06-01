package Programs;

public class PrimeNumber {
	public static void main(String args[]) {
		int num = 6;
		int temp = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp++;
			}
		}
		if (temp == 0) {
			System.out.println("Entered number is PRIME");
		} else {
			System.out.println("Entered number is not an PRIME");
		}
	}
}