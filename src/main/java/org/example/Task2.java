import  java.util.Random;
import java.util.Scanner;

public class Task2 {
    static void main() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secretNum = random.nextInt(100);
        int attempts = 0;

        while (attempts < 10){
            System.out.println("Введите число от 1 до 100: ");
            int number = scanner.nextInt();

            if (number < 1 || number > 100){
                System.out.println("Введено неверное число. Диапазон 1-100");
                continue;
            }
            attempts++;

            if(number< secretNum){
                System.out.println("Моё число больше");
            }
            else if (number > secretNum){
                System.out.println("Моё число меньше");
            }
            else {
                System.out.println("Вы угадали!");
                System.out.println("Было угадано за: " + attempts + "попыток");
                return;
            }
        }
        System.out.println("Вы исчерпали все попытки. Число было: " + secretNum);
        scanner.close();
    }
}
