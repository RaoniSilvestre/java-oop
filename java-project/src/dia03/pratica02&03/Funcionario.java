public class Funcionario extends Pessoa {
  protected double salario;

  @Override
  public void print() {
    super.print();
    System.out.println("Salário: " + this.salario);
  }
}
