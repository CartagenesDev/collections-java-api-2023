package main.java.list.operacoesBasicas;


//no usages new*
public class Tarefa {
    //atributo
    // 2 usages

    private String descricao;


    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao ;
    }

   


    
    
}
