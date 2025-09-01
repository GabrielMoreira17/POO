import javax.swing.*;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double imc = 0.0;
        Double peso;
        Double altura;

        String input1 = JOptionPane.showInputDialog("Digite o seu peso: ");
        String input2 = JOptionPane.showInputDialog("Digite a sua altura em cm: ");

        peso = Double.parseDouble(input1);
        altura = Double.parseDouble(input2);
        altura = altura / 100;

        imc = peso / (altura * altura);


        String imcFormatado = String.format("%.2f", imc);

        JOptionPane.showMessageDialog(null, "IMC: " + imcFormatado);
    }
}