import java.util.Scanner;

public class TaskFive {
    //TODO Задача 5: Вывод чисел в обратном порядке
    // Напишите программу, которая выводит числа от N до 1 в обратном порядке
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}
