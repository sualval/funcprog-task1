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
                .split("[^a-z�-�]+"))
                .sorted()
                .distinct()
                .toList();
    }
// ������ split ��������� ����������������� � ��� �������� ��������.
// �.�.��������������� ���������� ��������� ������ ������� �������������� �����������.
// ���������� �� ������ ������ ������� ������ �� ����������� ������ � �����.
// forEach(System.out::println) ������� �� ������ split ����� �������� �������� �������� � ������ ������� � �������.
}
