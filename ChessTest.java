import java.util.Scanner;

public class ChessTest {
    public static void main(String[] args) {
        System.out.println("Grudu skaiciuokles!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite langelio skaiciu: ");
        int langelioSkaicius = scanner.nextInt();

        String result = ChessTest.skaiciavimai(langelioSkaicius);
        System.out.println(langelioSkaicius + " langelyje yra: " + result);

    }
    static String skaiciavimai(int sk1) {
        String resultToString = "";
        double result = 0;
        double grudai = 1;
        for (int i = 1; i <= sk1; i++) {
            grudai *= 2;
            if (i < 2) {
                grudai = 1;
            };
            result += grudai;
        };
        if (result < Math.pow(2, 17)) {
            resultToString += String.format("Result: %.0f", result);
        } else {
        resultToString += String.format("result: %.0f%.0f\n", result / 100000, result % 100000);
        };

        return resultToString;
    }
}
