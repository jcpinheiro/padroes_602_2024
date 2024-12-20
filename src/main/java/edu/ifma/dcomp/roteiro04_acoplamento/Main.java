package edu.ifma.dcomp.roteiro04_acoplamento;

import edu.ifma.dcomp.roteiro01_revisitandoOO.BalancoEmpresa;
import edu.ifma.dcomp.roteiro01_revisitandoOO.Divida;

public class Main {
    public static void main(String[] args) {
        BalancoEmpresa balancoEmpresa = new BalancoEmpresa();

        balancoEmpresa.registraDivida("54.016.851/0001-51",
                "Banco XPTO", 1000 );
        balancoEmpresa.pagaDivida("54.016.851/0001-51", 200,
                                    "empresaXYZ", "82.365.166/0001-76" );

        balancoEmpresa.pagaDivida("54.016.851/0001-51", 300,
                "empresaXYZ", "82.365.166/0001-76" );

        Divida divida = balancoEmpresa.getDivida("54.016.851/0001-51" );

        System.out.println(divida );
        System.out.println("---------------");
        System.out.println(divida.getPagamentos() );



    }
}