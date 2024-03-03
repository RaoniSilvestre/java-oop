package dia02;

public class VerificarPalindromo {
  public static void isPalindromo() {
    String palavra = "aaaaaaaaa";

    int j = palavra.length() - 1;
    int k = 0;
    for (int i = 0; i < palavra.length() - 1; i++) {

      if (palavra.charAt(i) == palavra.charAt(j)) {

        j--;
      } else {
        k = 1;
      }
    }
    if (k == 0) {
      System.out.println("Palindrome!!");
    } else {
      System.out.println("Not a palindrome!!");
    }
  }
}
