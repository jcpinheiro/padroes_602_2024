package edu.ifma.dcomp.boaspraticas.roteiro04_acoplamento;

import java.util.LinkedHashMap;
import java.util.Map;

public class BalancoEmpresa {

    private Map<CNPJ, Divida> dividas = new LinkedHashMap<>();

    public void registraDivida(Divida divida) {
        dividas.put(divida.getCnpjCredor(), divida);
    }

    public void pagaDivida(CNPJ cnpjCredor, Pagamento pagamento) {
        Divida divida = this.getDivida(cnpjCredor);
        divida.registra(pagamento);
    }

    public Divida getDivida(CNPJ cnpj) {

        Divida divida = dividas.get(cnpj);
        if (divida != null) {
            return divida;
        } else {
            throw new IllegalArgumentException("O CNPJ é inválido!");
        }
    }
}
