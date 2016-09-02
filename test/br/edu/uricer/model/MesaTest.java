package br.edu.uricer.model;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class MesaTest {

    @Test
    public void testIsOcupado() {
        System.out.println("isOcupado");
        Mesa instance = new Mesa();
        boolean expResult = false;
        boolean result = instance.isOcupado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void deveTotalizarItens() {
        Produto coca = new Produto();
        coca.setDescricao("Coca Cola");
        coca.setPreco(new BigDecimal("1.50"));

        Produto suco = new Produto();
        suco.setDescricao("Suco de laranja");
        suco.setPreco(new BigDecimal("1.0"));

        Mesa mesa = new Mesa(1);
        mesa.adicionarItem(coca, new BigDecimal("1"));
        mesa.adicionarItem(suco, new BigDecimal("2"));

        mesa.totalizar();

        assertEquals(new BigDecimal("3.50"), mesa.getValorTotal());
    }
}
