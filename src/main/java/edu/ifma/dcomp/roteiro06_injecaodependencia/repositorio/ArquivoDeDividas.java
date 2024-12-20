package edu.ifma.dcomp.roteiro06_injecaodependencia.repositorio;

import edu.ifma.dcomp.roteiro06_injecaodependencia.modelo.Divida;
import edu.ifma.dcomp.roteiro06_injecaodependencia.modelo.Documento;

public class ArquivoDeDividas implements ArmazenadorDeDividas {

    @Override
    public void salva(Divida divida) {
        System.out.println("");

    }

    @Override
    public Divida carrega(Documento documentoCredor) {
        return null;
    }

    public void fecharArquivo() {
        // fecha o arquivo de dividas;
    }
}
