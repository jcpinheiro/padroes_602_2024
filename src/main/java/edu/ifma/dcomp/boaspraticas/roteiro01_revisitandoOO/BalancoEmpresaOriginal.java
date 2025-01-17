package edu.ifma.dcomp.boaspraticas.roteiro01_revisitandoOO;

import java.util.HashMap;

public class BalancoEmpresaOriginal {

    private HashMap<String, Divida> dividas = new HashMap<>();

    public void registraDivida(String cnpjCredor, String credor, double valor) {
        Divida divida = new Divida();
        divida.setCredor(credor );
        divida.setCnpjCredor(cnpjCredor );
        divida.setTotal(valor );

        dividas.put(cnpjCredor, divida );
    }

    public void pagaDivida(String cnpjCredor, double valor ) {
        Divida divida = dividas.get(cnpjCredor);

        if ( divida != null ) {
           /* divida.setValorPago( divida.getValorPago() + valor );
            divida.paga(valor ); */

        } else {
            throw new IllegalArgumentException("O cnpj é inválido!!" );
        }
    }
}
