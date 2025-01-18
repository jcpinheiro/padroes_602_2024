package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public class DescontoComMaisde300Reais implements Desconto {

    private Desconto proximo;

    @Override
    public double aplicaDescontoNo(Orcamento orcamento) {

        if (orcamento.getValor() > 300.0 && temMaisDeDoisItens(orcamento ) ) {
            return orcamento.getValor() * 0.05;

        } else {
            return proximo.aplicaDescontoNo(orcamento);
        }
    }

    private boolean temMaisDeDoisItens(Orcamento orcamento) {
        return ( orcamento.getTotalDeItens() > 2 );
    }


    @Override
    public void proximo(Desconto desconto) {
        this.proximo = desconto;
    }
}
