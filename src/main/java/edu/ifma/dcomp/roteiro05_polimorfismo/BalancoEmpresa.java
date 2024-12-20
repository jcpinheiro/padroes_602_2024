package edu.ifma.dcomp.roteiro05_polimorfismo;

import javax.print.Doc;
import java.util.LinkedHashMap;
import java.util.Map;

public class BalancoEmpresa {

    private Map<Documento, Divida> dividas = new LinkedHashMap<>();

    public void registraDivida(Divida divida) {
       dividas.put(divida.getDocumentoCredor(), divida);
    }

    public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
        Divida divida = this.getDivida(documentoCredor );
        divida.registra(pagamento);
    }

    public Divida getDivida(Documento documentoCredor ) {

        Divida divida = dividas.get(documentoCredor );
        if (divida != null) {
            return divida;
        } else {
            throw new IllegalArgumentException("O CNPJ é inválido!");
        }
    }
}
