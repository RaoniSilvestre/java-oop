package dia02.mvc;

public class Tarefa {
  // Atributos
  private String titulo;
  private String descricao;
  private String status;

  // Getters e Setters
  public void setTitulo(String novoTitulo) { this.titulo = novoTitulo; }

  public String getTitulo() { return this.titulo; }

  public void setDescricao(String novaDesc) { this.descricao = novaDesc; }

  public String getDescricao() { return this.descricao; }

  public void setStatus(String novoStatus) { this.status = novoStatus; }

  public String getStatus() { return this.status; }
}
