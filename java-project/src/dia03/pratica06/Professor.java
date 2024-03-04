package dia03.pratica06;

public class Professor extends Funcionario {
  private int horasAula;

  public double calcularSalarioTotal() {
    int dinheiroHoras = 0;
    int horasExtras = 0;
    if (this.horasAula > 40) {
      horasExtras = this.horasAula - 40;
      dinheiroHoras = 100 * horasExtras;
    }

    return super.calcularSalarioTotal() + dinheiroHoras;
  }
}
