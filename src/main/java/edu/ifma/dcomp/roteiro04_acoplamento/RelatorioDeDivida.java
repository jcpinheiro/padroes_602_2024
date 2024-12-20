package edu.ifma.dcomp.roteiro04_acoplamento;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {
 
    public void geraRelatorio(Divida divida, NumberFormat formatadorDeNumero ) {
     System.out.println("Credor: " + divida.getCredor());
     System.out.println("Cnpj credor: " + divida.getCnpjCredor() );

    // agora utilizamos uma instância da classe NumberFormat 
    // para fazer a exibição dos valores      
      System.out.println("Valor a pagar: " + formatadorDeNumero.format(divida.valorAPagar()) );
      System.out.println("Valor total: " + formatadorDeNumero.format(divida.getTotal()));
    }

    public static void main(String[] args) {
        Divida divida = new Divida();
        CNPJ cnpj = new CNPJ("66.575.754/0001-88");
        divida.setCnpjCredor(cnpj );
        divida.setCredor("Banco XPTO" );
        divida.setTotal(1000 );

        Pagamento pagamento1 = new Pagamento();
        pagamento1.setPagador("Funcionario01");
        pagamento1.setCnpjPagador(new CNPJ("71.145.436/0001-17") );
        pagamento1.setValor(200 );

        Pagamento pagamento2 = new Pagamento();
        pagamento2.setPagador("Funcionario01");
        pagamento2.setCnpjPagador(new CNPJ("71.145.436/0001-17") );
        pagamento2.setValor(300 );

        divida.registra(pagamento1 );
        divida.registra(pagamento2);

        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR") );
        //new Locale("pt", "BR"));

        RelatorioDeDivida relatorio = new RelatorioDeDivida();
        relatorio.geraRelatorio(divida, formatador );

    }
}
