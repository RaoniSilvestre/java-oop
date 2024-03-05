package dia04.pratica01_02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaB extends Conta {
  public ContaB(String nome, double credito, ArrayList<LocalDate> historico) {
    super(nome, credito, historico);
    this.bonus = 1.05;
  }

  public void receberCredito(double novoCredito, LocalDate novoRegistro) {
    this.credito = this.credito + novoCredito * this.bonus;
    this.historico.add(novoRegistro);
  }

  public void aumentarBonus(double novoBonus, LocalDate novoRegistro) {
    this.bonus = Math.pow(this.bonus, novoBonus);
    this.historico.add(novoRegistro);
  }
}
