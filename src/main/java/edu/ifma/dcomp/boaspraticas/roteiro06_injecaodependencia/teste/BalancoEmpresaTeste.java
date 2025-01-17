package edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.teste;

import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.modelo.BalancoEmpresa;
import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.modelo.Divida;
import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.modelo.Pagamento;
import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.repositorio.RepositorioDeDivida;
import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.modelo.CNPJ;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {
        Divida divida = new Divida();
        CNPJ cnpj = new CNPJ("66.575.754/0001-88");
        divida.setDocumentoCredor (cnpj );
        divida.setTotal(1000 );

        Pagamento pagamento = new Pagamento();
        pagamento.setPagador("Funcionario01");
        pagamento.setCnpjPagador(new CNPJ("71.145.436/0001-17") );
        pagamento.setValor(400 );

        Pagamento pagamento2 = new Pagamento();
        pagamento2.setPagador("Funcionario01");
        pagamento2.setCnpjPagador(new CNPJ("71.145.436/0001-17") );
        pagamento2.setValor(300 );

        RepositorioDeDivida repositorio =
                new RepositorioDeDivida("localhost/mysql/dividasbd", "joao", "secreta");

        BalancoEmpresa balancoEmpresa = new BalancoEmpresa(repositorio );

        balancoEmpresa.registraDivida(divida );
        balancoEmpresa.pagaDivida(divida.getDocumentoCredor(), pagamento  );
        balancoEmpresa.pagaDivida(divida.getDocumentoCredor(), pagamento2 );

        divida = balancoEmpresa.getDivida(cnpj );

        System.out.println(divida.getTotal() );
        System.out.println(divida.valorAPagar() );
        System.out.println(divida.getHistoricoPagamentos() );

    }
}
