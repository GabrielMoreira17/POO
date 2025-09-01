import java.util.Scanner;

public class Repeticao {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numero;


        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        for (int i = 0; i <= numero; i++)
        {
            if (i % 2 == 0) {
                System.out.println("É par: " + i);
            } else {
                System.out.println("É ímpar: " + i);
            }
        }
    }
}
