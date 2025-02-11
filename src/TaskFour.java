import java.util.Scanner;

public class TaskFour {
    //TODO Задача 4: Таблица умножения
    // Напишите программу, которая выводит таблицу умножения для числа, введенного пользователем
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Multiplication table for the number: " + number);

        for (int i = 1; i < 11; i++) {
            int temp = number * i;
            System.out.println(number + " * " + i + " = " + temp);
        }
    }
}
