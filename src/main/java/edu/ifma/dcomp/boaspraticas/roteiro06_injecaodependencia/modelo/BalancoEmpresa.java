package edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.modelo;

import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.repositorio.ArmazenadorDeDividas;

public class BalancoEmpresa {

    private ArmazenadorDeDividas repositorio;

    public BalancoEmpresa(ArmazenadorDeDividas repositorio) {
        this.repositorio = repositorio;
    }

    public void registraDivida(Divida divida) {
       repositorio.salva(divida );
    }

    public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
        Divida divida = this.getDivida(documentoCredor );
        divida.registra(pagamento);
    }

    public Divida getDivida(Documento documentoCredor ) {

        Divida divida = repositorio.carrega(documentoCredor );
        if (divida != null) {
            return divida;
        } else {
            throw new IllegalArgumentException("O Documento " + documentoCredor + " é inválido!");
        }
    }


}
