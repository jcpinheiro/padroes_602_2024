package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public class DescontoComMaisde500Reais implements Desconto {

    private Desconto proximo;

    @Override
    public double aplicaDescontoNo(Orcamento orcamento) {

        if (orcamento.getValor() > 500 ) {
            return orcamento.getValor() * 0.07;

        } else {
            return proximo.aplicaDescontoNo(orcamento);
        }
    }


    @Override
    public void proximo(Desconto desconto) {
        this.proximo = desconto;
    }
}
