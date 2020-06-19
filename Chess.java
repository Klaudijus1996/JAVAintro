import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        System.out.println("Grudu skaiciuokle!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite langelio skaiciu: ");
        int langelioSkaicius = scanner.nextInt();

        String result = Chess.skaiciavimai(langelioSkaicius);
        System.out.println(langelioSkaicius + " langelyje yra: " + result);

        double grudai = 1;
        double suma = 0;
        int langeliai = 64;
//        while (langeliai-- > 1) {
//            grudai *= 2;
//            suma += grudai;
//        }
        for (int i=1; i<=langeliai;i++) {
            grudai *= 2;
            if (i < 2) {
                grudai = 1;
            }
            suma += grudai;
        }
    }
    static String skaiciavimai(int sk1) {
        int base = 2;
        double result = 0;
        String kazkas;
        if (/*sk1 > 64 ||*/ sk1 < 0) {
            System.out.println("ERROR: neatpazintas langelis!");
        } else {
            result = Math.pow(base, sk1);
        }
        kazkas = String.format("%.1f", result);
        return kazkas;
    }
}
