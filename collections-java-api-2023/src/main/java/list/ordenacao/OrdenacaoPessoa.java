package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class OrdenacaoPessoa {

    public List<Pessoa> listPessoa;

    public OrdenacaoPessoa() {
        this.listPessoa = new ArrayList<>();
    }

    public void adicionarpessoa(String nome, int idade, double altura){
        //Pessoa pessoa = new Pessoa(nome, idade, altura);
        //this.listPessoa.add(pessoa);
        //Simplifado
        this.listPessoa.add(new Pessoa(nome, idade, altura));


    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade, null);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorAltura, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2) {
                return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
            }
        });
        return pessoasPorAltura;
    }
    public static void main(String[] args){
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarpessoa("Nome 1", 29, 1.56);
        ordenacaoPessoa.adicionarpessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarpessoa("Nome 3", 25, 1.70);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }

    


    
    
}
