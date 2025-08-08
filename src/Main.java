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
        Scanner sc = new Scanner(System.in);

        // Variável que armazena a distância de ida
        double distanciaKm;

        // Variável que armazena a distância total (ida e volta)
        double distanciaTotal;

        // Variável que armazena o consumo (km por litro)
        double consumoKmPorLitro;

        // Variável que armazena o valor do combustível
        double precoCombustivel;

        // Solicita ao usuário qual é a distância e armazena
        System.out.print("Digite a distância (apenas ida, em km): ");
        distanciaKm = sc.nextDouble();

        // Cálculo da distância de ida e volta
        distanciaTotal = distanciaKm * 2;

        // Solicita o preço do combustível
        System.out.print("Digite o preço do combustível: ");
        precoCombustivel = sc.nextDouble();

        // Solicita o consumo do ônibus
        System.out.print("Digite o consumo do ônibus (km por litro): ");
        consumoKmPorLitro = sc.nextDouble();

        // Calcula litros necessários
        double litrosNecessarios = distanciaTotal / consumoKmPorLitro;

        // Calcula custo total da viagem
        double custoViagem = litrosNecessarios * precoCombustivel;

        // Exibe os resultados
        System.out.println("==============================================");
        System.out.println("A distância total da excursão foi de: " + distanciaTotal + " km");
        System.out.println("O consumo do ônibus foi de: " + consumoKmPorLitro + " km/l");
        System.out.println("O preço do combustível informado é de: R$ " + precoCombustivel);
        System.out.println("Quantidade de combustível necessária: " + litrosNecessarios + " litros");
        System.out.println("Custo total da viagem: R$ " + custoViagem);

        sc.close();
    }
}