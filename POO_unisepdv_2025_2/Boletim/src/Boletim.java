import javax.swing.*;

public class Boletim {
    public static void main(String[] args) {
        String alunos[] = new String[3];
        Double nota1[] = new Double[3];
        Double nota2[] = new Double[3];
        Double media[] = new Double[3];
        Double mediaturma = 0.0;

        for(int i = 0; i < 3; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            alunos[i] = nome;
            Double b1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno: "));
            nota1[i] = b1;
            Double b2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno: "));
            nota2[i] = b2;

            media[i] = nota1[i] + nota2[i];
            media[i] = media[i] / 2;
            mediaturma += media[i];
        }
        mediaturma = mediaturma / alunos.length;
        String nomes = "";
        for(int i = 0; i < 3; i++)
        {
            nomes = nomes + "Alunos: " + alunos[i] +
            " - B1: " + nota1[i] + " - B2: " + nota2[i] + " - Média: " + String.format("%.2f", media[i]) + "\n";
        }

        JOptionPane.showMessageDialog(null, nomes);
        JOptionPane.showInputDialog(" - Média da turma: " + String.format("%.2f", mediaturma));
    }
}