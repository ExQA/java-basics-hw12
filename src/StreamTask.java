import java.util.stream.IntStream;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return IntStream.of(numbers)
                .filter(n -> n % 2 == 0)
                .map(k -> k * k)
                .sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return IntStream.of(numbers)
                .filter(n -> n % 2 != 0)
                .sorted()
                .toArray();
    }
}
