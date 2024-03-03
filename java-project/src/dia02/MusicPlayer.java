package dia02;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlayer {
  public static void main(String[] args) {
    LinkedList<String> playlist = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    int opcao;
    do {
      System.out.println("### Music Player ###");
      System.out.println("1. Adicionar Música à Playlist");
      System.out.println("2. Avançar para a Próxima Música");
      System.out.println("3. Voltar para a Música Anterior");
      System.out.println("4. Exibir Playlist");
      System.out.println("5. Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do teclado

      switch (opcao) {
        case 1:
          System.out.print("Digite o nome da música: ");
          String novaMusica = scanner.nextLine();
          // ADICIONAR MÚSICA À PLAYLIST AQUI
          break;
        case 2:
          if (!playlist.isEmpty()) {
            // AVANÇAR PARA A PRÓXIMA MÚSICA AQUI
          } else {
            System.out.println("A playlist está vazia.");
          }
          break;
        case 3:
          if (!playlist.isEmpty()) {
            // VOLTAR PARA A MÚSICA ANTERIOR AQUI
          } else {
            System.out.println("A playlist está vazia.");
          }
          break;
        case 4:
          if (!playlist.isEmpty()) {
            System.out.println("Playlist:");
            // EXIBIR PLAYLIST AQUI
          } else {
            System.out.println("A playlist está vazia.");
          }
          break;
        case 5:
          System.out.println("Encerrando o Music Player...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
      System.out.println();
    } while (opcao != 5);

    scanner.close();
  }
}