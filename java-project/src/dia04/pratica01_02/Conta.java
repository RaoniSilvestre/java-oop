package dia04.pratica01_02;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract public class Conta implements IEmiteRelatorio {
  protected String nome;
  protected double credito;
  protected double bonus;
  protected String moeda;
  protected ArrayList<LocalDate> historico;

  public Conta(String nome, double credito, ArrayList<LocalDate> historico) {
    this.nome = nome;
    this.credito = credito;
    this.bonus = 1;
    this.moeda = "Real";
    this.historico = historico;
  }

  public abstract void receberCredito(double credito, LocalDate data);

  public abstract void aumentarBonus(double aumento, LocalDate data);

  public void imprimirHistorico() {
    for (LocalDate registro : this.historico) {
      System.out.println(registro);
    }
  }

  public void relatorioMensal() {
    for (LocalDate registro : this.historico) {
      if (registro.getMonthValue() == LocalDate.now().getMonthValue() &&
          registro.getYear() == LocalDate.now().getYear()) {
        System.out.println(registro);
      }
    }
  }

  public void relatorioAnual() {
    for (LocalDate registro : this.historico) {
      if (registro.getYear() == LocalDate.now().getYear()) {
        System.out.println(registro);
      }
    }
  }
}
