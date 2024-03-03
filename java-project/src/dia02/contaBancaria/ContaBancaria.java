package dia02;

public class ContaBancaria {
  // Membros privados
  private String numeroConta;
  private double saldo;

  // Construtor público
  public ContaBancaria(String numeroConta, double saldoInicial) {
    this.numeroConta = numeroConta;
    this.saldo = saldoInicial;
  }

  // Métodos de acesso (getters e setters)
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  public String getNumeroConta() { return numeroConta; }

  public void setSaldo(double saldo) { this.saldo = saldo; }

  public double getSaldo() { return saldo; }

  // Métodos públicos
  public void depositar(double valor) {
    // Implemente aqui a lógica para realizar o depósito
    this.saldo = this.saldo + valor;
  }

  public void sacar(double valor) {
    // Implemente aqui a lógica para realizar o saque
    this.saldo = this.saldo - valor;
  }

  public void exibirSaldo() {
    // Implemente aqui a lógica para exibir o saldo
    System.out.println("Saldo atual: " + this.saldo);
  }

  // Membros protegidos
  protected void transferir(ContaBancaria destino, double valor) {
    // Implemente aqui a lógica para realizar a transferência
    if (this.getSaldo() >= valor) {
      this.sacar(valor);
      destino.depositar(valor);
    } else {
      System.out.println("Saldo insuficiente");
    }
  }

  // Membros de visibilidade padrão (pacote)
  void alterarNumeroConta(String novoNumeroConta) {
    // Implemente aqui a lógica para alterar o número da conta
    this.numeroConta = novoNumeroConta;
  }

  void exibirNumeroConta() {
    // Implemente aqui a lógica para exibir o número da conta
    System.out.println(this.numeroConta);
  }
}
