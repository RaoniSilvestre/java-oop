package dia02;

public class ContaEspecial extends ContaBancaria {
  public ContaEspecial(String numeroConta, double saldoInicial) {
    super(numeroConta, saldoInicial);
  }

  public void realizarTransferencia(ContaBancaria contaDestino, double valor) {
    this.transferir(contaDestino, valor);
  }
}
