import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Выводим сообщение на консоль
        System.out.println("Как тебя зовут?");

        // Считываем имя пользователя
        String name = scanner.nextLine();

        // Выводим приветствие с введенным именем
        System.out.println("Привет, " + name + "!");

        // Закрываем сканер
        scanner.close();
    }
}
