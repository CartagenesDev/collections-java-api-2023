package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo lista de tarefas
    public List<Tarefa> tarefaList;

    //contrutor da lista de tarefas 
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }
        // metodo para adcionar uma tarefa
    public void adicionarTarefa(String descrição) {
        tarefaList.add(new Tarefa(descrição));
    }
    //metodo para remover uma tarefa fazendo uma comparação de itens repetidos
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }            
        }
        tarefaList.removeAll(tarefasParaRemover);
        
    }
    //obter numero total de tarefas
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }
    // obter descrição de tarefas
    public void obterdescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        /*listaTarefas.adicionarTarefa("tarefa01");
        listaTarefas.adicionarTarefa("tarefa01");
        listaTarefas.adicionarTarefa("tarefa02");*/
        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        //listaTarefas.removerTarefa("tarefa01");

        listaTarefas.obterdescricaoTarefas();
        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());


    }



}