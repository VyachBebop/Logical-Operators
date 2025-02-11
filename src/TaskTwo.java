import java.util.Scanner;

public class TaskTwo {
    //TODO Задача 2: Проверка четности числа
    // Напишите программу, которая проверяет, является ли введенное пользователем число четным или нечетным
    // Тест ввода:  Введите число: 7
    // Ожидаемый вывод: Число 7 - нечетное
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        String answer = number % 2 == 0 ? "The number: " + number + " - is even" : "The number: " + number + " - is odd";
        System.out.println(answer);
    }
}
