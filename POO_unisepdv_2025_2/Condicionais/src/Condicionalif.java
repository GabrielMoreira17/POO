/*
    ! - indica negação
    || - comparador OR / OU
    && - comparador AND / E
*/

        /*
        int nota = 5;
        int media = 7;

        if (nota < media)
        {
            System.out.println("Sua nota esta abaixo da média! Reprovado");
        } else {
            System.out.println("Sua nota esta acima da média!! Aprovado");
        }

        boolean existe = true;

        if (existe)
        {
            System.out.println("É verdadeiro");
        } else {
            System.out.println("É falso");
        }

        int num = 10;

        if (num % 2 == 0)
        {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }

        String nome = "Maria";
        String nome2 = "maria";
        boolean aprovado = true;

        if(nome.equalsIgnoreCase(nome2))
        {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }

        if(nome.equalsIgnoreCase(nome2))
        {
            System.out.println("Igual");
        }
        else if (aprovado)
        {
            System.out.println("Aprovado");
        }
        else
        {
            System.out.println("Reprovado");
        }
    }
         */

/*
    Crie uma aplicação java que recebe a nota e o nome de um aluno,
    e deve classificar essa nota de acordo com a tabela abaixo

    0 - 2 : ATENÇÃO MAXIMA
    2 - 5 : ATENÇÃO
    5 - 7 : FICAR DE OLHO
    7 - 8 : TA BOM
    8 - 9 : PODE MELHORAR
    10 : NÃO FEZ MAIS QUE A OBRIGAÇÃO
 */

import java.util.Scanner;

public class Condicionalif {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = s.nextLine();
        System.out.println("Digite sua nota: ");
        Double nota = s.nextDouble();
        String desc = "";

        if (nota >= 0.0 && nota <= 2)
        {
            desc = "Atenção maxima";
        }
        else if (nota > 2 && nota <= 5)
        {
            desc = "Atenção";
        }
        else if (nota > 5 && nota <= 7)
        {
            desc = "Ficar de olho";
        }
        else if (nota > 7 && nota <= 8)
        {
            desc =  "Ta bom";
        }
        else if (nota > 8 && nota <= 9)
        {
            desc = " Pode melhorar";
        }
        else if (nota == 10) {
            desc = "Não fez mais que a obrigação!";
        }
        else {
            desc = "Nota inválida!";
        }
        System.out.println("Nome: " + nome + " - Nota: " + nota + " - Descricao: " + desc);
    }
}
