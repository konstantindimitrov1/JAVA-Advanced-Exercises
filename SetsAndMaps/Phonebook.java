package SetsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> phonebook = new HashMap<>();
        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String phoneNumber = input.split("-")[1];
            phonebook.put(name, phoneNumber);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("stop")) {
            if (phonebook.containsKey(input)) {
                System.out.printf("%s -> %s\n", input, phonebook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.\n", input);
            }
            input = scanner.nextLine();
        }
    }
}