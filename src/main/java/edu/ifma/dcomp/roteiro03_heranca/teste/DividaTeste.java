package edu.ifma.dcomp.roteiro03_heranca.teste;

import edu.ifma.dcomp.roteiro03_heranca.Divida;
import edu.ifma.dcomp.roteiro03_heranca.Pagamento;

public class DividaTeste {

    public static void main(String[] args) {
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
