import java.util.Scanner;

public class TaskSix {
    //TODO Задача 6: Определение сезона года
    // Напишите программу, которая определяет сезон года на основе месяца, введенного пользователем.
    public static void main(String[] args) {

        System.out.println("Enter month (1-12): ");
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();

        switch (numberOfMonth)
        {
            case 1:
                System.out.println("January is winter season");
                break;
            case 2:
                System.out.println("February is winter season");
                break;
            case 3:
                System.out.println("March is spring season");
                break;
            case 4:
                System.out.println("April is spring season");
                break;
            case 5:
                System.out.println("May is spring season");
                break;
            case 6:
                System.out.println("June is summer season");
                break;
            case 7:
                System.out.println("July is summer season");
                break;
            case 8:
                System.out.println("August is summer season");
                break;
            case 9:
                System.out.println("September is autumn season");
                break;
            case 10:
                System.out.println("October is autumn season");
                break;
            case 11:
                System.out.println("November is autumn season");
                break;
            case 12:
                System.out.println("December is winter season");
                break;
            default:
                System.out.println("Unknown option selected");
                break;
        }
    }
}
