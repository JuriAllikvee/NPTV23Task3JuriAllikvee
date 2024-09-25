import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите личный код (11 цифр): ");
        String personalCode = scanner.nextLine();

        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();
        String year = personalCode.substring(1, 3);
        String month = personalCode.substring(3, 5);
        String day = personalCode.substring(5, 7);

        char centuryCode = personalCode.charAt(0);
        String century = "";

        switch (centuryCode) {
            case '1':
            case '2':
                century = "18";
                break;
            case '3':
            case '4':
                century = "19";
                break;
            case '5':
            case '6':
                century = "20";
                break;
            default:
                System.out.println("Неверный личный код.");
                return;
        }

        System.out.println("Дата рождения: " + day + "." + month + "." + century + year);
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
    }
}