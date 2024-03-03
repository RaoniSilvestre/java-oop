package dia02.mvc;
import java.util.ArrayList;
import java.util.List;

public class TarefaView {
  public void exibirTarefa(Tarefa tarefa) {
    System.out.println("Título: " + tarefa.getTitulo() +
                       "\nDescrição: " + tarefa.getDescricao() +
                       "\nStatus: " + tarefa.getStatus());
  }

  public void exibirTodasAsTarefas(ArrayList<Tarefa> listaDeTarefas) {
    for (Tarefa tarefinha : listaDeTarefas) {
      exibirTarefa(tarefinha);
    }
  }
}
