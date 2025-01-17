package edu.ifma.dcomp.boaspraticas.roteiro02_coesao;

public class Divida {

    private String credor;
    private double total;
    private CNPJ cnpjCredor;

    private HistoricoPagamentos historicoPagamentos = new HistoricoPagamentos();

    public CNPJ getCnpjCredor() {
        return cnpjCredor;
    }

    public String getHistoricoPagamentos() {
        return historicoPagamentos.toString();
    }

    public void setCnpjCredor(CNPJ cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }

    public void registra(Pagamento pagamento) {
        historicoPagamentos.registra(pagamento);
    }

    //delegate method

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double valorAPagar() {
        return total - historicoPagamentos.getValorPago();
    }
}
