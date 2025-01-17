package edu.ifma.dcomp.boaspraticas.roteiro02_coesao;

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
