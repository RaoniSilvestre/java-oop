package dia04.pratica01_02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Ajustando a classe ContaA para implementar Comparable
public class ContaA extends Conta implements Comparable<ContaA> {
  private double bonus;

  public ContaA(String nome, double credito, ArrayList<LocalDate> historico) {
    super(nome, credito, historico);
    this.bonus = 1.25;
  }

  public void receberCredito(double novoCredito, LocalDate novaData) {
    if (novoCredito >= 1000) {
      this.credito = this.credito + novoCredito * this.bonus;
    } else {
      this.credito = this.credito + novoCredito;
    }
    this.historico.add(novaData);
  }

  @Override
  public void aumentarBonus(double novoBonus, LocalDate novaData) {
    this.bonus = this.bonus * novoBonus;
    this.historico.add(novaData);
  }

  public void converterParaDolar(double cambio, LocalDate data) {
    this.moeda = "Dolar";
    this.credito = this.credito * cambio;
    this.historico.add(data);
  }

  public double calcularNota() { return this.credito * this.bonus; }

  @Override
  public int compareTo(ContaA outraConta) {
    return Double.compare(this.calcularNota(), outraConta.calcularNota());
  }
}
