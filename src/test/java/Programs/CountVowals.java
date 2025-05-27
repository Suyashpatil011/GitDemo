package Programs;

public class CountVowals {
  public static void main(String args[]) {
    String str = "ab";
    int vovals = 0;
    int constant = 0;
    int num = 0;
    int spacce = 0;
    for (char c: str.toCharArray()) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        vovals++;
      } else if (c >= 'b' && c <= 'z') {
        constant++;
      } else if (c >= '0' && c <= '9') {
        num++;
      } else if (c == ' ') {
        spacce++;
      }
    }
    System.out.println(" The number of vovals: " + vovals);
    System.out.println(" The number of Constants: " + constant);
    System.out.println(" The number of Digits: " + num);
    System.out.println(" The number of whiteSpaces: " + spacce);
  }
}
