package edu.ifma.dcomp.padroes.chainofresponsability_refatorado;


public class TesteCalculadorDeDesconto {

    public static void main(String[] args) {

        Desconto primeiroDesconto = new DescontoPorMaisDeCincoItens();
        Desconto segundoDesconto = new DescontoComMaisde500Reais();
        Desconto terceiroDesconto = new DescontoComMaisde300Reais();
        Desconto semDesconto = new SemDesconto();

        primeiroDesconto.proximo(segundoDesconto );
        segundoDesconto.proximo(terceiroDesconto );
        terceiroDesconto.proximo(semDesconto );


        Orcamento materialEscolar = new Orcamento(230 );

        materialEscolar.adiciona(new Item("Caderno", 20, 5));
        materialEscolar.adiciona(new Item("Papel a4", 20, 10));
        materialEscolar.adiciona(new Item("Gramatica", 150, 1));
      /*  materialEscolar.adiciona(new Item("Lápis", 10, 2));
        materialEscolar.adiciona(new Item("Lápis de Cor", 15, 2));*/
      //  materialEscolar.adiciona(new Item("Borracha", 10, 3));


        CalculadorDeDescontos calculadora = new CalculadorDeDescontos();

        System.out.println(calculadora.calcula(materialEscolar, primeiroDesconto) );
    }
}
