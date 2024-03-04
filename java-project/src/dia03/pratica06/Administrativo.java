package dia03.pratica06;

public class Administrativo extends Funcionario {
  private String nivelCargo;

  public double calcularSalarioTotal() {
    dounle bonification = 0;
    if (this.nivelCargo == "diretor") {
      bonification = 500;
    } else if (this.nivelCargo == "vice-diretor") {
      bonification = 300;
    } else if (this.nivelCargo == "supervisor") {
      bonification = 200;
    }

    return super.calcularSalarioTotal() + bonification;
  }
}
