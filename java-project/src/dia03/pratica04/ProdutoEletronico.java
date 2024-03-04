package dia03.pratica04;

import java.time.LocalDate;
public class ProdutoEletronico extends Produto {
  private LocalDate name;

  public void calcularPreçoTotalComImposto() {
    this.preço = 1.1 * this.preço + 100;
  }
}
