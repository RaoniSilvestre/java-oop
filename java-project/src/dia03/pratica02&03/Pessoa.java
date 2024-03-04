public class Pessoa {
  protected String name;
  protected String email;
  protected String telefone;
  protected double peso;
  protected double altura;
  protected String CPF;

  public void print() {
    System.out.println("Nome: " + name);
    System.out.println("Email: " + email);
    System.out.println("Telefone: " + telefone);
    System.out.println("Peso: " + peso);
    System.out.println("Altura: " + altura);
    System.out.println("CPF: " + CPF);
  }
}
