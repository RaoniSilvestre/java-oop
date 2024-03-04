package dia03.pratica0203;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Personal extends Funcionario {
  private LocalDate dataDeNascimento;
  private ArrayList<Aluno> alunos;

  public void orientarAluno(Aluno) {
    System.out.println("Orientando o " + Aluno.getNome());
  }

  public void montarTreino(Aluno) { System.out.println("Montando..."); }

  public void print() {
    super.print();
    System.out.println("Data de Nascimento: " + this.dataDeNascimento);
    for (Aluno aluno : alunos) {
      System.out.println("--------------------");
      aluno.print();
    }
  }
}
