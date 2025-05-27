package Programs;

public class MissingNumberinArray {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,9};
		
		int num = arr.length + 1;
		
		int total = num * (num + 1) / 2;
		
		for (int miss: arr) {
			total = total - miss;
		}
		System.out.println("The Missed number is: " + total);
	}
}