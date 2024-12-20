package edu.ifma.dcomp.roteiro05_polimorfismo.teste;

import edu.ifma.dcomp.roteiro05_polimorfismo.CNPJ;
import edu.ifma.dcomp.roteiro05_polimorfismo.Divida;
import edu.ifma.dcomp.roteiro05_polimorfismo.Pagamento;

public class DividaTeste {

    public static void main(String[] args) {

        String strCnpj1 = "71.145.436/0001-17";
        String strCnpj2 = "71.145.436/0001-17";

        CNPJ cnpj1 = new CNPJ("71.145.436/0001-17");
        CNPJ cnpj2 = new CNPJ("71.145.436/0001-17");


        System.out.println(strCnpj1.equals(strCnpj2 ) );

        System.out.println(cnpj1.equals(cnpj2 ) );

        System.out.println("-------------------------------");

        Divida divida = new Divida();
        divida.setTotal(1000 );

        Pagamento pagamento = new Pagamento();
        pagamento.setPagador("Funcionario01");
        pagamento.setValor(200 );

        Pagamento pagamento2 = new Pagamento();
        pagamento2.setPagador("Funcionario01");
        pagamento2.setValor(300 );


        divida.registra(pagamento );
        divida.registra(pagamento2 );

        System.out.println(divida.getTotal() );
        System.out.println(divida.valorAPagar() );
        System.out.println(divida.getHistoricoPagamentos() );

    }
}
