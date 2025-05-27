package Programs;

import java.util.Scanner;
public class MaxNumberInArray {
  public static void main(String args[]) {
    int arr[] = {23,10,22,65,75,30, 9};
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if ( arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("The max number is:" + max);
  }
}
