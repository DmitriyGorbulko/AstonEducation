package module.third;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) {
        String fileName = "moduleThird.txt";
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        inputToFile(fileName, text);
        String dataRead = getInFile(fileName);
        System.out.println("Данные: " + dataRead);
    }

    public static void inputToFile(String fileName, String data) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
            System.out.println("Данные в файле");
        } catch (IOException e) {
            CustomException ex = new CustomException(
                    "Ошибка записи: " + e.getMessage(),
                    500,
                    "Запись в файл"
            );
            System.err.println(ex.toString());
        }
    }

    public static String getInFile(String fileName) {
        StringBuilder data = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                data.append((char) character);
            }
            System.out.println("Данные получены");
        } catch (IOException e) {
            CustomException ex = new CustomException(
                    "Ошибка чтения: " + e.getMessage(),
                    500,
                    "Чтение файла"
            );
            System.err.println(ex.toString());
        }
        return data.toString();
    }
}
