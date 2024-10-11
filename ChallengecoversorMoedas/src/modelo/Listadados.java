package modelo;


public class Listadados implements Comparable <Listadados> {

    public String dadosmoedas;

    public Listadados(String dadosmoedas) {
        this.dadosmoedas = dadosmoedas;
    }

    @Override
    public int compareTo(Listadados outroListadados) {
        return this.dadosmoedas.compareTo(outroListadados.dadosmoedas);

    }

}
