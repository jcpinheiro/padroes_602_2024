package edu.ifma.dcomp.roteiro06_injecaodependencia.modelo;

import edu.ifma.dcomp.roteiro06_injecaodependencia.repositorio.ArmazenadorDeDividas;
import edu.ifma.dcomp.roteiro06_injecaodependencia.repositorio.RepositorioDeDivida;

import java.util.LinkedHashMap;
import java.util.Map;

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
