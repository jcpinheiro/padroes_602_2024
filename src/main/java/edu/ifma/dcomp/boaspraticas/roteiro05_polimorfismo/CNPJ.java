package edu.ifma.dcomp.boaspraticas.roteiro05_polimorfismo;

import java.util.Objects;

public class CNPJ implements Documento {

    private String valor;

    public CNPJ(String valor) {
        if (ehValido(valor ) )
            this.valor = valor;
        else
            throw new IllegalArgumentException("CNPJ Inválido!!");
    }

    @Override
    public String getNumero() {
        return valor;
    }
    @Override
    public boolean ehValido(String valor) {
        return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
                && segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
    }

    @Override
    public String toString() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CNPJ cnpj = (CNPJ) o;
        return Objects.equals(valor, cnpj.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    private boolean segundoDigitoCorretoParaCnpj() {
        return true;
    }

    private boolean segundoDigitoVerificadorDoCnpj() {
        return true;
    }

    private boolean primeiroDigitoCorretoParaCnpj() {
        return true;
    }

    private boolean primeiroDigitoVerificadorDoCnpj() {
        return true;
    }


}
