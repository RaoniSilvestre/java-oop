import dia04.pratica01_02.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {

  public static ContaA gerarContaAleatoria() {
    Random random = new Random();
    String nome = "Conta" + random.nextInt(1000);
    double credito = random.nextDouble() * 10000;
    return new ContaA(nome, credito, new ArrayList<>());
  }

  public static ContaA acharOMaior(List<ContaA> lista) {

    ContaA maior = lista.get(0);
    for (int i = 1; i < lista.size(); i++) {
      ContaA atual = lista.get(i);
      if (atual.compareTo(maior) > 0) {
        maior = atual;
      }
    }
    return maior;
  }

  public static void main(String[] args) {
    // Criando a lista de contas
    List<ContaA> contas = new ArrayList<>();

    // Adicionando 1000 contas aleatórias na lista
    for (int i = 0; i < 1000; i++) {
      contas.add(gerarContaAleatoria());
    }

    // Encontrando a maior conta na lista
    ContaA maiorConta = acharOMaior(contas);

    // Imprimindo a maior conta
    System.out.println("A maior conta tem nota: " + maiorConta.calcularNota());
  }
}
