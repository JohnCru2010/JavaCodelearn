import java.util.*;

public class Word1 {
  public static void main(String[] args) {
    String phrase = new String();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Insert a phrase: ");
    phrase = sc.nextLine();
    System.out.println("The given phrase after deleting the last word is " + deleteLastWord(phrase));
  }
  
  private static String deleteLastWord (String text) {
    text.trim();
    int lastSpace = text.lastIndexOf(' ');
    return text.substring(0, lastSpace);
  }
}
