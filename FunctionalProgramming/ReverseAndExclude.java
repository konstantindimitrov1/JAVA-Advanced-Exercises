package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s++"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int divideBy = Integer.parseInt(scanner.nextLine());

        numbers = numbers.stream()
                .filter(x -> x % divideBy != 0)
                .collect(Collectors.toList());

        Collections.reverse(numbers);

        System.out.println(numbers.toString().replaceAll("[,\\[\\]]", ""));


    }
}