package edu.ifma.dcomp.padroes.strategy_refatorado;

public class TesteCalculadorDeImpostos {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(1000);
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto pis = new PIS();

        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

        calculadora.realizaCalculo(reforma, icms );
        calculadora.realizaCalculo(reforma, iss );
        calculadora.realizaCalculo(reforma, pis );

    }
}
