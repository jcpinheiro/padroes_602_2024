package edu.ifma.dcomp.boaspraticas.roteiro05_polimorfismo;

public class CPF implements Documento {
    private String valor;

    public CPF(String valor) {
        if (ehValido(valor ) )
            this.valor = valor;
        else
            throw new IllegalArgumentException("CPF Inválido!!");
    }

    @Override
    public String getNumero() {
        return valor;
    }
    @Override
    public boolean ehValido(String numero) {
        return true;
    }
}
