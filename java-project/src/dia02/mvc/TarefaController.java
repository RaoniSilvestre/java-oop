package dia02.mvc;

import java.util.ArrayList;
import java.util.List;

public class TarefaController {
  // Atributos
  private ArrayList<Tarefa> listaDeTarefas;
  // Constructor, getters e setters
  public TarefaController() { this.listaDeTarefas = new ArrayList<>(); }

  // Métodos CRUD
  public void addTarefa(Tarefa novaTarefa) {
    this.listaDeTarefas.add(novaTarefa);
  }

  public Tarefa getTarefa(int index) {

    TarefaView tarefaView = new TarefaView();
    tarefaView.exibirTarefa(listaDeTarefas.get(index));
    return this.listaDeTarefas.get(index);
  }

  public ArrayList<Tarefa> getAllTarefas() { return this.listaDeTarefas; }

  public void updateTarefa(int index, Tarefa updatedTarefa) {
    this.listaDeTarefas.set(index, updatedTarefa);
  }

  public void deleteTarefa(int index) { this.listaDeTarefas.remove(index); }
}
