package dia03.pratica06;

import java.util.ArrayList;
import java.util.List;

public class Escola {

  private ArrayList<Funcionario> funcionarios;

  public void addFuncionario(Funcionario novoFuncionario) {
    this.funcionarios.add(novoFuncionario);
  }

  public void calcularFolhaDePagamento() {
    double soma = 0;
    for (Funcionario func : funcionarios) {
      soma = soma + func.calcularSalarioTotal();
    }
    System.out.println(soma);
  }
}
