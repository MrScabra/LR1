import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] argv) {
        System.out.println("Hello world");
        System.out.println("Karpinskiy Serhii PZ-20-1/9 ");

        // Отримання поточної дати та часу
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Форматування дати та часу в рядок
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Поточна дата і час: " + formattedDateTime);
    }
}