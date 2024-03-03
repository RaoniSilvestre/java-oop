package dia02;

public class Carrinho {

  public static void imprimirCarrin(String[] carrinho, int tam) {
    if (10 == tam) {
      System.out.println(carrinho[tam]);
      imprimirCarrin(carrinho, tam + 1);
    }
  }

  public static void carrinhoDeCompras() {
    String[] carrinho = new String[10];

    carrinho[0] = "Banana";
    carrinho[1] = "Maça";

    for (int i = 2; i < 10; i++) {
      carrinho[i] = "Coca Cola 2.5L";
    }
    imprimirCarrin(carrinho, 0);
  }

}