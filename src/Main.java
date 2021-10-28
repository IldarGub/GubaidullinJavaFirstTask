import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        double input = scanner.nextDouble();
        if (input > 7) {
            System.out.println("Привет");
        } else if (input == 7) {
            System.out.println("Вы ввели число 7");
        } else {
            System.out.println("Вы ввели число меньше 7");
        }
    }
}