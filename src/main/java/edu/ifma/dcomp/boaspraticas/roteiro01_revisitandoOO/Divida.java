package edu.ifma.dcomp.boaspraticas.roteiro01_revisitandoOO;

import java.util.ArrayList;

public class Divida {

    private String credor;
    private String cnpjCredor;
    private double total;
    private double valorPago;

    private ArrayList<Pagamento> pagamentos = new ArrayList<>();

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }


    public void registra(Pagamento pagamento) {
        pagamentos.add(pagamento );
        this.paga(pagamento.getValor() );
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public String getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(String cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorPago() {
        return valorPago;
    }

    private void paga(double valor) {
        if (valor <= 0 ) {
            throw new IllegalArgumentException("O valor deve ser maior do que zero");
        }
        if (valor > 1000) {
            valor = valor * 0.99;
        }

        this.valorPago = this.valorPago + valor;

    }


    @Override
    public String toString() {
        return "Divida{" +
                "credor='" + credor + '\'' +
                ", cnpjCredor='" + cnpjCredor + '\'' +
                ", total=" + total +
                ", valorPago=" + valorPago +
                '}';
    }


}
