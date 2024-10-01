import java.util.Scanner;

public class App {
    public static double calculate(double I0, double b, double r) {
        double I = I0 - (b * r);
        return I;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan investasi awal : ");
        double I0 = scanner.nextDouble();

        System.out.print("Masukkan kemiringan kurva investasi : ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan tingkat bunga: ");
        double r = scanner.nextDouble();

        double total = calculate(I0, b, r);
        System.out.println("Total : " + total);

        scanner.close();
    }
}
