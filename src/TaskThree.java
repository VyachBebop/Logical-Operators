import java.util.Scanner;

public class TaskThree {
    //TODO Задача 3: Факториал числа
    // Напишите программу, которая вычисляет факториал числа, введенного пользователем.
    // Тест ввода: Введите число: 5
    // Факториал числа 5 равен 120.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int temp = number;

        for (int i = 1; i < number; i++) {
            temp *= i;
        }
        System.out.println("The factorial of " + number + " is " + temp);
    }
}
