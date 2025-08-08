import java.util.Scanner;

public class Main {

    /*
    Objetivo: Calcular custo de uma excursão.

    Variáveis sugeridas: double distanciaKm, double consumoKmPorLitro, double precoCombustivel.

    Tarefas:

    Guardar distância total (ida e volta).

    Guardar consumo do ônibus.

    Guardar preço do combustível.

    Calcular litros necessários e custo total.
     */

    public static void main(String[] args) {

        //Variavel que armazena a distancia
        Double distancia;

        //Variavel que armazena distancia de ida e volta
        Double DistanciaIdaeVolta;

        //Variavel que armazena o consumo
        Double ConsumoKmPorLitro;

        //Variavel que vai armazenar o custo da Excursão
        Double CustoViajem;

        //Variavel que armazena o valor do combustivel
        Double PrecoCombustivel;

        //Solicita ao usuário qual é a distancia e armazena o valor em uma variavel
        System.out.print("Digite o distancia: ");
        distancia = new Scanner(System.in).nextDouble();

        //Faz o calculo da distancia de ida e volta
        DistanciaIdaeVolta = distancia * 0.02;

        System.out.print("Digite o preço do combustível: ");
        PrecoCombustivel = new Scanner(System.in).nextDouble();

        System.out.println("Digite o consumo do onibus: ");
        ConsumoKmPorLitro = new Scanner(System.in).nextDouble();
    }
}
