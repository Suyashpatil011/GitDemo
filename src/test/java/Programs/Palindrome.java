package Programs;

// Panildrome -> Palindrome number is a number that reads the same forward and backward.

public class Palindrome {
	public static void main(String args[]) {
		int num = 121;
		int temp = num;
		int rem, rev = 0;
		while (temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (num == rev) {
			System.out.println("Entered Number is Palindrome:" + rev);
		} else {
			System.out.println("Entered Number is Not an Palindrome:" + rev);
		}
	}
}



//String str = "Madam";
//str = str.toLowerCase();  // Optional: for case-insensitive comparison
//
//String reversed = "";
//for (int i = str.length() - 1; i >= 0; i--) {
//	    reversed += str.charAt(i);
//}
//
//if (str.equals(reversed)) {
//	    System.out.println("Palindrome");
//} else {
//	    System.out.println("Not a palindrome");
//}

