package edu.ifma.dcomp.roteiro06_injecaodependencia.repositorio;

import edu.ifma.dcomp.roteiro06_injecaodependencia.modelo.Divida;
import edu.ifma.dcomp.roteiro06_injecaodependencia.modelo.Documento;

public interface ArmazenadorDeDividas {
    void salva(Divida divida);

    Divida carrega(Documento documentoCredor);
}
