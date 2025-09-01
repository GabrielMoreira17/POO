public class Main {
    public static void main(String[] args) {
        Double SalarioBruto = 5000.00;
        Double perInss = 11.5;
        Double perIr = 27.5;
        Double valorInss = SalarioBruto * perInss / 100;
        Double vlCorretoIr = SalarioBruto - valorInss;
        Double valorIr = vlCorretoIr * perIr / 100;
        Double SalarioLiq = SalarioBruto - valorInss - valorIr;

        System.out.println("% INSS: " + valorInss);
        System.out.println("% IR: " + valorIr);
        System.out.println("Salário liquido: " + SalarioLiq);
    }
}