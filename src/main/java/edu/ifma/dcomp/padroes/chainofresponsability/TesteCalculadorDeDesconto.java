package edu.ifma.dcomp.padroes.chainofresponsability;

public class TesteCalculadorDeDesconto {

    public static void main(String[] args) {
        Orcamento materialEscolar = new Orcamento(530 );
        materialEscolar.adiciona(new Item("Caderno", 20, 5));
        materialEscolar.adiciona(new Item("Papel a4", 20, 10));
        materialEscolar.adiciona(new Item("Gramatica", 150, 1));
        materialEscolar.adiciona(new Item("Lápis", 10, 2));
//        materialEscolar.adiciona(new Item("Lápis de Cor", 15, 2));
//        materialEscolar.adiciona(new Item("Borracha", 10, 3));


        CalculadorDeDescontos calculadora = new CalculadorDeDescontos();

        System.out.println(calculadora.calcula(materialEscolar) );
    }
}
