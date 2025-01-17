package edu.ifma.dcomp.boaspraticas.roteiro03_heranca;

import java.util.ArrayList;

class HistoricoPagamentosComHeranca extends ArrayList<Pagamento> {

    private double valorPago;

    // private ArrayList<Pagamento> pagamentos = new ArrayList<>();

   /* public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }*/

    public void registra(Pagamento pagamento) {
        this.add(pagamento );
        this.paga(pagamento.getValor() );
    }

    @Override
    public boolean add(Pagamento pagamento) {
        registra(pagamento );
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
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
        for (Pagamento pagamento : this) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;

    }


}
