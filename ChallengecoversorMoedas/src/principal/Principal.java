package principal;

//1.Dólar===Peso Argentino;
// 2.Peso argentino===Dólar
// 3.Dólar==Real brasileiro
//4.Real brasileiro===Dólar
// 5.Dólar==Peso Colombiano
// 6.Peso colombiano==Dólar
// 7.Sair

import java.util.ArrayList;
import java.util.Collections;
import modelo.Listadados;
import modelo.Moedas;
import java.util.Scanner;



public class Principal {
    public static void main(String[] args) {

        ArrayList<Listadados> lista = new ArrayList<>();

        System.out.println("\n\n");

        lista.add(new Listadados("O Dólar é represntado pelo (US)"));
        lista.add(new Listadados("O Peso  Argentino é representado pelo (ARS)"));
        lista.add(new Listadados("O Peso Colombiano é representado pelo (COP)"));
        lista.add(new Listadados("O Real é representado pelo (BRL)"));

        Collections.sort(lista);

        for (Listadados listadados : lista) {
            System.out.println(listadados.dadosmoedas);


        }

        Moedas moeda = new Moedas();
        moeda.setDolar(10.00);
        moeda.setPesoArgentino(4.00);
        moeda.setPesoColombiano(2.00);
        moeda.setRealBrasileiro(12.90);
        moeda.setTaxamoedaDolar(1);
        moeda.setTaxamoedaArgentino(979.4200);
        moeda.setTaxamoedaColombiano(4236.9659);
        moeda.setTaxamoedaBrasileiro(5.5857);

        System.out.println("\n\n");


        Scanner leitura = new Scanner(System.in);

        int opcao=0;

        while(opcao!=7) {
            System.out.println("Informe a escolha que deseja\n");
            System.out.println("[1]-Dólar para Peso Argentino\n" +
                    "[2]-Peso Argentino para Dólar\n" +
                    "[3]-Dólar para Real Brasileiro\n" +
                    "[4]-Real Brasileiro para Dólar\n" +
                    "[5]-Dólar para Peso Colombiano\n" +
                    "[6]-Peso colombiano para Dólar\n" +
                    "[7]-Sair");
            int escolha = leitura.nextInt();
            switch (escolha) {

                case 1:

                    System.out.println("Dolar para Peso Argentino\n");
                    double resultadoDocalP=moeda.getDolar() * moeda.getTaxamoedaArgentino();
                    System.out.println(resultadoDocalP+"\n");

                    break;

                case 2:

                    System.out.println("Peso Argentino para Dolar\n");
                    double resultadoDocalS=moeda.getPesoArgentino() / moeda.getTaxamoedaDolar();
                    System.out.println(resultadoDocalS+"\n");

                    break;

                case 3:

                    System.out.println("Dolar para Real Brasileiro\n");
                    double resultadoDocalT=moeda.getDolar() * moeda.getTaxamoedaBrasileiro();
                    System.out.println(resultadoDocalT+"\n");

                    break;

                case 4:

                    System.out.println("Real Brasileiro para Dolar\n");
                    double resultadoDocalQU=moeda.getRealBrasileiro() / moeda.getTaxamoedaDolar();
                    System.out.println(resultadoDocalQU+"\n");

                    break;

                case 5:

                    System.out.println("Dolar para Peso Colombiano\n");
                    double resultadoDocalQUI=moeda.getDolar() * moeda.getTaxamoedaColombiano();
                    System.out.println(resultadoDocalQUI+"\n");

                    break;

                case 6:

                    System.out.println("Peso colombiano para Dolar\n");
                    double resultadoDocalSE=moeda.getPesoColombiano() / moeda.getTaxamoedaDolar();
                    System.out.println(resultadoDocalSE+"\n");

                    break;

                case 7:

                    System.out.println("Sair!");

                    break;

                default:

                    System.out.println("Tente novamente!\n");

            }


        }

    }

}
