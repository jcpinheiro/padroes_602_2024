package edu.ifma.dcomp.padroes.strategy;

public class TesteCalculadorDeImpostos {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(1000);

        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

        calculadora.realizaCalculo(reforma, "ISS");

    }
}
