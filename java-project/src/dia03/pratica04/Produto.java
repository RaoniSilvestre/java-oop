package dia03.pratica04;

public class Produto {
  protected double preço;

  public void calcularPreçoTotalComImposto() { this.preço = 1.02 * this.preço; }

  public void setPreço(double novoPreço) { this.preço = novoPreço; }

  public double getPreço() { return this.preço; }
}
