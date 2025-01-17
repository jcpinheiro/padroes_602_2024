package edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.modelo;

public interface Documento {
    public abstract String getNumero();
    public abstract boolean ehValido(String numero );

}
