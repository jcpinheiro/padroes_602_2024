package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public interface Desconto {
    public double aplicaDescontoNo(Orcamento orcamento );
    public void proximo(Desconto desconto);

}
