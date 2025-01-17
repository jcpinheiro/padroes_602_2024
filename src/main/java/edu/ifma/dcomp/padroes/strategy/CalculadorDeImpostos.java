package edu.ifma.dcomp.padroes.strategy;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, String imposto ) {

        if (imposto.equalsIgnoreCase("ICMS")) {
            // if-else ...
            double icms = orcamento.getValor() * 0.10;
            System.out.println(icms );

        } else if(imposto.equalsIgnoreCase("ISS")) {
            double iss = orcamento.getValor() * 0.05;
            System.out.println(iss );

        } else {
            throw new IllegalArgumentException("Imposto é inválido!!!" );
        }

    }

}
