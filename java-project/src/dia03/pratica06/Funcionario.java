package dia03.pratica06;

import java.time.LocalDate;
public class Funcionario {
  protected String nome;
  protected double salarioBase;
  protected LocalDate dataEntradaNaEscola;

  public String getNome() { return this.nome; }

  public void setNome(String nomeNovo) { this.nome = nomeNovo; }

  public double getSalarioBase() { return salarioBase; }

  public void setSalarioBase(double novoSalario) {
    this.salarioBase = novoSalario;
  }

  public LocalDate getDataEntradaNaEscola() { return this.dataEntradaNaEscola; }

  public void setDataEntradaNaEscola(LocalDate novaData) {
    this.dataEntradaNaEscola = novaData;
  }

  public double calcularSalarioTotal() {
    return this.salarioBase +
        this.salarioBase * 0.05 * (2024 - this.dataEntradaNaEscola.getYear());
  }
}
