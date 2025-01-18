package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;

public class CalculadorDeDescontos {

  public double calcula(Orcamento orcamento, Desconto desconto ) {
    return desconto.aplicaDescontoNo(orcamento );

  }
}
