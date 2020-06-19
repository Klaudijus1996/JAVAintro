import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        System.out.println("Perfect numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberInput = scanner.nextInt();
        int result = PerfectNum.checkNumber(numberInput);
        String dividers = PerfectNum.checkDividers(numberInput);
        if (numberInput != result) {
            System.out.println("The number you entered is not 'Perfect' because: " + numberInput + " divides by: " + dividers + "and their sum equals: " + result);
        } else {
        System.out.println("Your number " + numberInput + " divides by: " + dividers + "which sum equals: " + result); }

    }
    static int checkNumber(int number) {
        int result = 0;
        for (int i=1;i<number;i++){
            if (number % i == 0) {
                result += i;
            }
        }
        return result;
    }
    static String checkDividers(int number) {
        String dividerOfNum = "";
        for (int i=1;i<number;i++){
            if (number % i == 0) {
                dividerOfNum += i + " ";
            }
        }
        return dividerOfNum;
    }
}
