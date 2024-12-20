package edu.ifma.dcomp.roteiro03_heranca;

import java.util.ArrayList;

class HistoricoPagamentos  {

    private double valorPago;

    private ArrayList<Pagamento> pagamentos = new ArrayList<>();

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento );
        this.paga(pagamento.getValor() );
    }

    public boolean existe(Pagamento pagamento) {
        return pagamentos.contains(pagamento );
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

    public double getValorPago() {
        return valorPago;
    }


    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;

    }


}
