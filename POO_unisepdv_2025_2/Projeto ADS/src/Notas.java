public class Notas {
    /*
    Crie as váriaveis para armazenar o nome
    do aluno, a nota b1 e b2, e o período.
    Após isso imprima os dados das váriaveis
    */
    public static void main(String[] args){
    String Nome = "Gabriel";
    double b1 = 9.3;
    double b2 = 8.5;
    int periodo = 2;

        System.out.println("Seu nome é: " + Nome);
        System.out.println(periodo + "° Período" );
        System.out.println("Sua nota em b1 foi: " + b1);
        System.out.println("Sua nota em b2 foi: " + b2);
        //Agora calcula a média do semestre
        //com base na nota de b1 e sabendo que
        //a média é 7,0 informe qual é a nota necesária
        //para aprovação

        System.out.println("A nota necessária para B2 é: " + (14 - b1));
    }
}