package edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.modelo;

public class Pagamento {
    private String pagador;
    private CNPJ cnpjPagador;
    private double valor;

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public CNPJ getCnpjPagador() {
        return cnpjPagador;
    }

    public void setCnpjPagador(CNPJ cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "pagador='" + pagador + '\'' +
                ", cnpjPagador='" + cnpjPagador + '\'' +
                ", valor=" + valor +
                '}';
    }
}
