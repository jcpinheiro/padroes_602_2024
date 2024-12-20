package edu.ifma.dcomp.roteiro06_injecaodependencia.repositorio;

import edu.ifma.dcomp.roteiro06_injecaodependencia.modelo.Divida;
import edu.ifma.dcomp.roteiro06_injecaodependencia.modelo.Documento;

import java.util.HashMap;
import java.util.Map;

public class RepositorioDeDivida implements ArmazenadorDeDividas {

    private Map<Documento, Divida> dividasNoBanco = new HashMap<>();

    public RepositorioDeDivida(String endereco, String usuario, String senha) {
        System.out.println("Conectado!");
    }

    @Override
    public void salva(Divida divida) {
        dividasNoBanco.put(divida.getDocumentoCredor(), divida);
    }

    @Override
    public Divida carrega(Documento documentoCredor) {
        return dividasNoBanco.get(documentoCredor);
    }

    public void desconecta() {
        System.out.println("Desconectado!");
    }

}
