package edu.ifma.dcomp.padroes.chainofresponsability;

public class CalculadorDeDescontos {

  public double calcula(Orcamento orcamento ) {
    // verifica primeira regra de possível desconto

    if(orcamento.getItens().size() > 5) {
      // buscar informaçoes do banco
      // ...
      return orcamento.getValor() * 0.10;
    }
     
    // verifica segunda regra de possível desconto
    else if(orcamento.getValor() > 500.0) {
      return orcamento.getValor() * 0.07;
    }

    else if (orcamento.getValor() > 300.0 && orcamento.getTotalDeItens() > 2) {
      return orcamento.getValor() * 0.05;
    }
     
    // verifica quarta, quinta regra de
    // possível desconto  ...
    // um monte de ifs daqui pra baixo
    return 0;
  }
}
