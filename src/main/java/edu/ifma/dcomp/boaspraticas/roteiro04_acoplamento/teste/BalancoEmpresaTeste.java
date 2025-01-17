package edu.ifma.dcomp.boaspraticas.roteiro04_acoplamento.teste;

import edu.ifma.dcomp.boaspraticas.roteiro04_acoplamento.BalancoEmpresa;
import edu.ifma.dcomp.boaspraticas.roteiro04_acoplamento.CNPJ;
import edu.ifma.dcomp.boaspraticas.roteiro04_acoplamento.Divida;
import edu.ifma.dcomp.boaspraticas.roteiro04_acoplamento.Pagamento;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {
        Divida divida = new Divida();
        CNPJ cnpj = new CNPJ("66.575.754/0001-88");
        divida.setCnpjCredor(cnpj );
        divida.setTotal(1000 );

        Pagamento pagamento = new Pagamento();
        pagamento.setPagador("Funcionario01");
        pagamento.setCnpjPagador(new CNPJ("71.145.436/0001-17") );
        pagamento.setValor(200 );

        Pagamento pagamento2 = new Pagamento();
        pagamento2.setPagador("Funcionario01");
        pagamento2.setCnpjPagador(new CNPJ("71.145.436/0001-17") );
        pagamento2.setValor(300 );

        BalancoEmpresa balancoEmpresa = new BalancoEmpresa();

        balancoEmpresa.registraDivida(divida );
         balancoEmpresa.pagaDivida(divida.getCnpjCredor(), pagamento  );
        balancoEmpresa.pagaDivida(divida.getCnpjCredor(), pagamento2 );

        divida = balancoEmpresa.getDivida(cnpj );

        System.out.println(divida.getTotal() );
        System.out.println(divida.valorAPagar() );
        System.out.println(divida.getHistoricoPagamentos() );

    }
}
