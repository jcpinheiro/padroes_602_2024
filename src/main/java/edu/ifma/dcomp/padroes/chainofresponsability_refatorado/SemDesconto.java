package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public class SemDesconto implements Desconto {
    @Override
    public double aplicaDescontoNo(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void proximo(Desconto desconto) {
        throw new RuntimeException("Sem desconto");
    }
}
