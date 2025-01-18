package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public class DescontoPorMaisDeCincoItens implements Desconto {

    private Desconto proximo;

    @Override
    public double aplicaDescontoNo(Orcamento orcamento) {
        // ...
        if(orcamento.getTotalDeItens() > 5 )
            return orcamento.getValor() * 0.10;
        else
            return proximo.aplicaDescontoNo(orcamento );
    }

    @Override
    public void proximo(Desconto desconto) {
        this.proximo = desconto;
    }
}
