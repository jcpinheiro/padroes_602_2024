package edu.ifma.dcomp.boaspraticas.roteiro02_coesao;

import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<String, Divida> dividas = new HashMap<>();

    // TODO melhorar o acoplamento desse método
    public void registraDivida(String cnpjCredor, String credor, double valor) {
        Divida divida = new Divida();
        divida.setCredor(credor );
        divida.setCnpjCredor(new CNPJ(cnpjCredor) );
        divida.setTotal(valor );

        dividas.put(cnpjCredor, divida );
    }
    // TODO melhorar o acoplamento desse método com a classe Pagamento
    public void pagaDivida(String cnpjCredor, double valor, String pagador, String cnpjPagador ) {
        Divida divida = dividas.get(cnpjCredor);
        if ( divida != null ) {
           /* divida.setValorPago( divida.getValorPago() + valor );
            divida.paga(valor ); */

            Pagamento pagamento = new Pagamento();
            pagamento.setCnpjPagador(cnpjPagador);
            pagamento.setPagador(cnpjPagador);
            pagamento.setValor(valor );

            divida.registra(pagamento );
            //divida.paga(valor );
        } else {
            throw new IllegalArgumentException("O cnpj é inválido!!" );
        }
    }

    public Divida getDivida(String cnpj) {
        return dividas.get(cnpj);

    }
}