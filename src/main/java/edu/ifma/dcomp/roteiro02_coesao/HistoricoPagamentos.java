package edu.ifma.dcomp.roteiro02_coesao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

class HistoricoPagamentos {

    private double valorPago;

    private ArrayList<Pagamento> pagamentos = new ArrayList<>();

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void registra(Pagamento pagamento) {
        pagamentos.add(pagamento );
        this.paga(pagamento.getValor() );
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

    @Override
    public String toString() {
        return "HistoricoPagamentos{" +
                "valorPago=" + valorPago +
                ", pagamentos=" + pagamentos +
                '}';
    }
}
