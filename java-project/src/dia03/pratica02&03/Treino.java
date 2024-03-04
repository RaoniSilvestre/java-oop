import java.util.HashMap;
import java.util.Map;

public class Treino {
  private Map<String, String> exercicios;
  private String diaDoTreino;

  public void editarTreino(Map<String, String> novosExercicios) {
    this.exercicios = novosExercicios;
  }

  public void adicionarExercicio(String novoExercicio) {
    System.out.println("Exercicio adicionado");
  }
}
