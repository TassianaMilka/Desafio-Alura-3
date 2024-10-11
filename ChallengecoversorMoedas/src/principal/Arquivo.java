package principal;

import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    public static void main(String[] args) {

        String dado = "O dólar norte-americano, real brasileiro, peso argentino e peso colombiano são moedas que circulam em diferentes países da América Latina e exercem um papel fundamental em suas economias. O dólar, como moeda de reserva mundial, possui a maior influência no mercado financeiro global, sendo utilizado como referência para diversas transações internacionais. O real brasileiro, embora com menor peso no cenário mundial, é a moeda mais forte da América Latina e desempenha um papel crucial nas relações comerciais da região. O peso argentino e o peso colombiano, por sua vez, têm enfrentado desafios econômicos e suas moedas apresentam maior volatilidade em relação ao dólar. Diante desse cenário, o dólar norte-americano se destaca como a moeda mais potente no mercado financeiro, influenciando diretamente as demais moedas e a economia global. No entanto, a importância de cada moeda varia de acordo com o contexto econômico e político de cada país.";

                try (FileWriter writer = new FileWriter("Dados das moedas.txt")) {
                    writer.write(dado);
                    System.out.println("Dados gravados com sucesso.");
                } catch (IOException e) {
                    e.printStackTrace();

                }
    }
}



