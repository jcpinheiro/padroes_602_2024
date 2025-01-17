package edu.ifma.dcomp.boaspraticas.roteiro05_polimorfismo;

import java.util.LinkedHashMap;
import java.util.Map;

public class BalancoEmpresaAntigo {

  /*  private Map<CNPJ, Divida> dividasPJ = new LinkedHashMap<>();
    private Map<CPF, Divida> dividasPF = new LinkedHashMap<>();


    public void registraDivida(Divida divida) {
        if (divida.getCnpjCredor() != null )
            dividasPJ.put(divida.getCnpjCredor(), divida );

        else if (divida.getCpfCredor() != null )
            dividasPF.put(divida.getCpfCredor(), divida );

        else
            throw new IllegalArgumentException("A divida não possui um documento credor!!" );
    }

    public void pagaDivida(CNPJ cnpjCredor, Pagamento pagamento) {
        Divida divida = this.getDivida(cnpjCredor);
        divida.registra(pagamento);
    }

    public void pagaDivida(CPF cpfCredor, Pagamento pagamento) {
        Divida divida = this.getDivida(cpfCredor);
        divida.registra(pagamento);
    }

    public Divida getDivida(CNPJ cnpj) {

        Divida divida = dividasPJ.get(cnpj);
        if (divida != null) {
            return divida;
        } else {
            throw new IllegalArgumentException("O CNPJ é inválido!");
        }
    }

    public Divida getDivida(CPF cpf ) {

        Divida divida = dividasPF.get(cpf);
        if (divida != null) {
            return divida;
        } else {
            throw new IllegalArgumentException("O CPF é inválido!");
        }
    }

   */
}
