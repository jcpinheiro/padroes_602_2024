package edu.ifma.dcomp.boaspraticas.roteiro05_polimorfismo;

public class Divida {

    private String credor;
    private double total;
    private Documento documentoCredor;

    private HistoricoPagamentos historicoPagamentos = new HistoricoPagamentos();

    public String getHistoricoPagamentos() {
        return historicoPagamentos.toString();
    }

    public Documento getDocumentoCredor() {
        return documentoCredor;
    }

    public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
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
