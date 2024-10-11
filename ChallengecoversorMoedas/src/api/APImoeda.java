package api;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

record Moedasiglap(String siglap,String siglas){}
record Moedasiglas(String siglat,String siglaq){}

public class APImoeda {
    public static void main(String[] args) {



        String jsonMoedaP = "{\"siglap\":\"US-1\",\"siglas\":\"ARS-979.4200\" }";
        Gson gsonP = new Gson();
        Moedasiglap moedap = gsonP.fromJson(jsonMoedaP, Moedasiglap.class);
        System.out.println(moedap);

        String jsonMoedaS = "{\"siglat\":\"COP-4236.9659\",\"siglaq\":\"BRL-5.5857\" }";
        Gson gsons = new Gson();
        Moedasiglas moedas = gsons.fromJson(jsonMoedaS, Moedasiglas.class);
        System.out.println(moedas);

        System.out.println("\n");

        String endereco ="https://v6.exchangerate-api.com/v6/d3b85c293725c2043ff0137e/latest/USD";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco)).build();
            System.out.println(endereco);

        } catch (ErroConsultaException e) {
            System.out.println("Erro!");
            System.out.println(e.getMessage());
        }
    }
}

