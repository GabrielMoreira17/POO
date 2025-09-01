public class Maiin {
    public static void main(String[] args) {
        Double Xis = 12.00;
        Double Coca = 5.00;
        Double Pacoca = 2.50;

        Double Saldo = 100.00;

        Double VlrGasto = Saldo - ((2 * Xis) + (3 * Coca) + (4 * Pacoca));

        System.out.println("VlrGasto: " + VlrGasto);
    }
}