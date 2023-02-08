import java.util.Scanner;

public class ReverseWord {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = in.nextLine();

    int length = word.length();
    char[] reversed = new char[length];

    for (int i = 0; i < length; i++) {
      reversed[length - i - 1] = word.charAt(i);
    }

    System.out.println("The reversed word is: " + new String(reversed));
  }
}