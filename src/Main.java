import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Enter text: ");
        text = scanner.nextLine();
        split(text).forEach(System.out::println);
        scanner.close();

    }

    private static List<String> split(String text) {
        return Arrays.stream(text.toLowerCase()
                .split("[^a-zа-я]+"))
                .sorted()
                .distinct()
                .toList();
    }
// меттод split получился детерменированным и без побочных эффектов.
// Т.к.последовательно происходит обработка текста вызовом функциональных интерфейсов.
// Получаевый на выходе список зависит только от переданного текста в метод.
// forEach(System.out::println) вынесен из метода split чтобы избежать побочных эффектов с вводом выводом в консоль.
}
