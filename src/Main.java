import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scnr = new Scanner(System.in);
        int num = 0;
        if (scnr.hasNextInt()) {
            num = scnr.nextInt();
            if (num % 2 == 0) {
                System.out.println("Это целое четное число");
            } else System.out.println("Ошибка! Это не четное число");
        } else System.out.println("Вы ввели не целое число");
    }
}