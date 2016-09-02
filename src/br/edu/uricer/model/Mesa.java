package br.edu.uricer.model;

import java.math.BigDecimal;
import java.util.List;


public class Mesa {
    private boolean ocupado;
    private List<Item> itens;
    private BigDecimal valorTotal;

    Mesa(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Mesa(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        BigDecimal valorTotal = new BigDecimal ("0.0");
        for (Item item:itens){
            item.totalizar();
            valorTotal = valorTotal.add(item.getValorTotal());
           
        }
    }
    public void adicionar(){
                
    }
    
}
