package edu.ifma.dcomp.roteiro04_acoplamento;

import java.util.Objects;

public class CNPJ {

    private String valor;

    public CNPJ(String valor) {
        if (ehValido() )
            this.valor = valor;
        else
            throw new IllegalArgumentException("CNPJ Inválido!!");
    }

    public String getValor() {
        return valor;
    }

    public boolean ehValido() {
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
