package dia03.pratica04;

public class ProdutoImportado extends Produto {
  private String paisOrigem;

  public void calcularPreçoTotalComImposto() { this.preço = 1.05 * this.preço; }
}
