package br.edu.uricer.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Mesa {
    private int numero;
    private boolean ocupado;
    private List<Item> itens = new ArrayList<>();
    private BigDecimal valorTotal;

    public Mesa(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean isOcupado() {
        return ocupado;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    public void ocupar(){
        ocupado = true;
    }
     public void desocupar(){
        ocupado = false;        
    }
      public void totalizar(){
        valorTotal = new BigDecimal ("0.0");
        for (Item item:itens){
            item.totalizar();
            valorTotal = valorTotal.add(item.getValorTotal());
           
        }
    }
    public void adicionarItem(Produto produto, BigDecimal quantidade, BigDecimal valorUnitario){
        Item novoItem = new Item();
        novoItem.setProduto(produto);
                
    }
    
}
