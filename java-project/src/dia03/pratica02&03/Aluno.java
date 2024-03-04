import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
  private ArrayList<Treino> treinos;
  private LocalDate dataDeNascimento;
  private boolean mensalidadePaga;

  public void pagarMensalidade() { this.mensalidadePaga = true; }

  public void verTreinoDoDia(String treino) {
    System.out.println("Oia ai o treino...");
  }

  public void verTodosOsTreinos() {
    for (int i = 0; i < 3; i++) {
      System.out.println("Treino " + i + ":"
                         + "e ela só falava dale");
    }
  }
}
