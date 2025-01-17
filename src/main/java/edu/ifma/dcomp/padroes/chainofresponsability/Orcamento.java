package edu.ifma.dcomp.padroes.chainofresponsability;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private double valor;
    List<Item> itens = new ArrayList<>();

    public void adiciona(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getTotalDeItens() {
        return itens.size();
    }
}
