import java.util.Scanner;

public class Task1 {
    /*
     * Реализуйте 3 метода,
     * чтобы в каждом из них
     * получить разные исключения
     */

    public static void main(String[] args) {
        Input();
    }

    public static void Input() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число");
        String a = iScanner.nextLine();
        iScanner.close();
        if (a.isEmpty()) {
            throw new RuntimeException("Вы ничего не ввели");
        }        
        isDigit(a);
    }

    public static void isDigit(String a) {
        char c = a.charAt(0);
        if (Character.isDigit(c)) {
            int b = Integer.parseInt(a);
            Division(b);
        } else {
            throw new RuntimeException("Вы ввели не число");
        }
    }

    public static void Division(Integer b) {
        if (b == 0) {
            throw new RuntimeException("Вы ввели 0, на 0 делить нельзя");
        }
        System.out.println(500 / b);
    }
}