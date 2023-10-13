package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //chama os atributos da classe Item
    public List<Item> itemList;


//construtor do carrinhos de compras
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adcionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);

    }

    public void removerItem(String nome, double preco, int quantidade){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i: itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);

                }
            }
            itemList.removeAll(itensParaRemover);

        }
        else {
            System.out.println("A lista esta vazia");
        }

    }
    public int totalDeIntens(){
        return itemList.size();
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public double calcularvalorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item i: itemList){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal = valorTotal + valorItem;
            }
            return valorTotal;

        }else{
            throw new RuntimeException("A lista está vazia");
        }
        
    }
     

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adcionarItem("Biscoito", 3.40, 10 );
        carrinhoDeCompras.adcionarItem("Chocolate", 5.10, 3 );
        carrinhoDeCompras.adcionarItem("Cereal", 2.80, 6 );
        carrinhoDeCompras.adcionarItem("Refrigerante", 4.50, 15 );
     
        System.out.println("A quantidade de itens é: " + carrinhoDeCompras.totalDeIntens());
        
        //carrinhoDeCompras.adcionarItem("Biscoito", 3.40, 10 );
        //carrinhoDeCompras.removerItem(null, 0, 0);

        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularvalorTotal()); 



    }




    


    
}
