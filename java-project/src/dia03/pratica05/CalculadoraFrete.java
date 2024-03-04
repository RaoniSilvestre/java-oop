package dia03.pratica05;

public class CalculadoraFrete {

  public double calcularFrete(double peso) { return 0.75 * peso; }

  public double calcularFrete(double peso, String tipoServico) {
    if (tipoServico == "expresso") {
      return 0.75 * peso + 20;
    } else if (tipoServico == "especial") {
      return 0.75 * peso + 10;
    } else {
      calcularFrete(peso);
    }
  }

  public double calcularFrete(double peso, double distancia) {
    return 0.75 * peso + (5 * (distancia / 100));
  }

  public double calcularFrete(double peso, double distancia,
                              String tipoServico) {
    if (tipoServico == "expresso") {
      return 0.75 * peso + (5 * (distancia / 100)) + 20;
    } else if (tipoServico == "especial") {
      return 0.75 * peso + (5 * (distancia / 100)) + 10;
    } else {
      return calcularFrete(peso);
    }
  }
}
