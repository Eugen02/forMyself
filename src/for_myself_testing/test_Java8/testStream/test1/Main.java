package for_myself_testing.test_Java8.testStream.test1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static int count = 0;

    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(ar)
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum);
        Stream.of(3, 3, 0)
                .takeWhile(x -> x > 1)
                .map(x -> x + 10)
                .forEach(System.out::println);

        Stream.of(1, 2, 3, 4, 2, 5)
                .takeWhile(x -> x > 3)
                .map(x -> x + 10)
                .forEach(System.out::println);


        Scanner sc = new Scanner(System.in);
        String for_test = sc.nextLine();
        for_test = Stream.of(for_test)
                .collect(Collectors.joining("-"));
        System.out.println(for_test);
    }
}
