import dia02.mvc.*;

public class Main {
  public static void main(String[] args) {
    Tarefa jardinagem = new Tarefa();
    jardinagem.setTitulo("Jardinagem");
    jardinagem.setDescricao("Ato de ajeitar o jardim");
    jardinagem.setStatus("Incompleto");

    TarefaController listaDeTarefas = new TarefaController();
    listaDeTarefas.addTarefa(jardinagem);
    Tarefa jardinagem2 = listaDeTarefas.getTarefa(0);
  }
}
