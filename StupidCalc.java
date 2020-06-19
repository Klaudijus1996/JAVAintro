import java.util.Objects;
import java.util.Scanner;

public class StupidCalc {
    public static void main(String[] args) {
        System.out.println("Kvailas kalkuliatorius!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite pirma skaiciu");
        int pirmas = scanner.nextInt();

        System.out.print("Iveskite antra skaiciu:");
        int antras = scanner.nextInt();

        System.out.print("Iveskite operacija (+ - * /): ");
        String operacija = scanner.next();

        int rezultatas = StupidCalc.skaiciavimas(operacija,pirmas,antras);
        // TODO skaiciavimai

        System.out.println(pirmas + " " + operacija + " " + antras + " = " + rezultatas);
    }
    // cia galima kurti kitus metodus/funkcijas;
    static int skaiciavimas(String op, int p1, int p2) {
        int rezultatas = 0;

        if (Objects.equals(op, "+")) {
            rezultatas = p1 + p2;
        } else if (Objects.equals(op, "-")) {
            rezultatas = p1 - p2;
        } else if (Objects.equals(op, "/")) {
            rezultatas = p1 / p2;
        } else if (Objects.equals(op, "*")) {
            rezultatas = p1 * p2;
        }
        return rezultatas;
    }
}
