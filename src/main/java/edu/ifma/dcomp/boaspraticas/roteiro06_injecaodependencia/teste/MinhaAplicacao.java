package edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.teste;

import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.modelo.*;
import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.repositorio.ArquivoDeDividas;
import edu.ifma.dcomp.roteiro06_injecaodependencia.modelo.*;
import edu.ifma.dcomp.boaspraticas.roteiro06_injecaodependencia.repositorio.RepositorioDeDivida;

public class MinhaAplicacao {
  public static void main(String[] args) {
    RepositorioDeDivida repositorio =
            new RepositorioDeDivida("localhost/mysql/dividasbd", "joao", "secreta");
    ArquivoDeDividas arquivoDeDividas = new ArquivoDeDividas();

    BalancoEmpresa balanco = new BalancoEmpresa(repositorio );
    Documento docCredor = new CNPJ("00.000.000/0001-01");

    registraDividas(balanco, docCredor );
    realizaPagamentos(balanco, docCredor);

    repositorio.desconecta();
  }
  private static void registraDividas(BalancoEmpresa balanco, Documento docCredor) {
    Divida d1 = new Divida();
    d1.setDocumentoCredor(docCredor);
    d1.setTotal(5000);


    Divida d2 = new Divida();
    d2.setDocumentoCredor(docCredor);
    d2.setTotal(3000);
    // preenche dados das dividas
    balanco.registraDivida(d1);
    balanco.registraDivida(d2);
  }
  private static void realizaPagamentos(BalancoEmpresa balanco, Documento docCredor) {
    Pagamento p1 = new Pagamento();
    p1.setValor(1000);
    Pagamento p2 = new Pagamento();
    p2.setValor(1500);

    // preenche dados dos pagamentos
    balanco.pagaDivida(docCredor, p1);
    balanco.pagaDivida(docCredor, p2);
  }
}