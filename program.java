import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1(scanner);
    }

    static String enterNumName(Scanner scanner) {
        System.out.println("Введите имя и номера телефона через пробел:  ");
        return scanner.next().toLowerCase() + scanner.nextLine().toLowerCase();
    }

    static void addContact(HashMap<String, List<String>> dataPhoneBook,
            String numNameInfo) {
        String[] someArray = numNameInfo.split(" ");
        List<String> numberList = new ArrayList<>();
        for (int i = 1; i < someArray.length; i++) {
            numberList.add(someArray[i]);
        }
        dataPhoneBook.put(someArray[0], numberList);
    }

    static void printNumber(HashMap<String, List<String>> dataPhoneBook, Scanner scanner) {
        System.out.println("Для поиска номера телефона введите имя: ");
        String contactName = scanner.nextLine().toLowerCase();
        System.out.println(
                "Найденные номера: " + dataPhoneBook.get(contactName).toString().replaceAll("^\\[|\\]$", ""));
    }

    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
    // человек может иметь несколько телефонов.
    static void task1(Scanner scanner) {

        HashMap<String, List<String>> dataPhoneBook = new HashMap<>();
        addContact(dataPhoneBook, enterNumName(scanner));
        addContact(dataPhoneBook, enterNumName(scanner));
        printNumber(dataPhoneBook, scanner);
    }

// static void task2() {
// String strListNaming = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна
// Мусина, Анна Крутова, " +
// "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина
// Светлова, " +
// "Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, " +
// "Иван Мечников, Петр Петин, Иван Ежов";

// }
}
