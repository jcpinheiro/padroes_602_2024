package edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.teste;

import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.modelo.HistoricoPagamentos;
import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.modelo.Pagamento;

public class TesteHistoricoPagamentos {

    public static void main(String[] args) {
        Pagamento pagamento1 = new Pagamento();
        pagamento1.setValor(100);
        pagamento1.setPagador("funcionario xyz");

        Pagamento pagamento2 = new Pagamento();
        pagamento2.setValor(200);
        pagamento2.setPagador("funcionario xyz");

        HistoricoPagamentos historicoPagamentos = new HistoricoPagamentos();
        historicoPagamentos.registra(pagamento1);
        historicoPagamentos.registra(pagamento2 );

        System.out.println(historicoPagamentos.getValorPago() );

        boolean temPagamento = historicoPagamentos.existe(pagamento2);

        System.out.println("Tem pagamento 2 : " + temPagamento);

        for(Pagamento pagamento: historicoPagamentos.getPagamentos() ) {
            System.out.println(pagamento);
        }
    }
}
