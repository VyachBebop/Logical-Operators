import java.util.Scanner;

public class TaskOne {
    //TODO Задача 1: Расчет суммы и среднего значения
    // Напишите программу, которая принимает два числа от пользователя и выводит их сумму и среднее значение
    // Тест ввода:  Введите первое число: 10,  Введите второе число: 20
    // Ожидаемый вывод: Сумма: 30 , Среднее значение: 15.0
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("Total: " + total);
        double average = (double) total / 2;
        System.out.println("Average: " + average);

    }

}
