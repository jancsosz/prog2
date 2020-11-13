package excersize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Adott egy “legacy” kód mely tartalmaz anonymus interface implementációkat, ciklusokat és feltételes kifejezések.
 * Ebben a feladatban ezt a “legacy” kódot szeretnénk átírni lambda kifejezések segítségével (metódus referencia használata előnyt jelent).
 *
 * A program jelenlegi kimenete:
 *  Runnable!
 *  Calculation result: 9
 *  Result numbers:
 *  1
 *  9
 *  25
 *  Formatted numbers: 1925
 */
public class LegacyRefactoring {

    public void legacy() {
        //Runnable runnable = new Runnable(() ->  {System.out.println("Runnable!");}).run();

        Runnable runnable = newRunnable();
        runnable.run();

        Calculator calculator = newCalculator();

        Integer result = calculator.calculate(3);
        System.out.println("Calculation result: " + result);

        List<Integer> inputNumbers = Arrays.asList(1, null, 3, null, 5);
        List<Integer> resultNumbers = new ArrayList<>();

        resultNumbers = inputNumbers.stream()
                                    .filter(num -> num != null)
                                    .map(calculator::calculate)
                                    .collect(Collectors.toList());

        Consumer<Integer> method = newConsumer();

        System.out.println("Result numbers: ");
        resultNumbers.forEach(method);

        Formatter formatter = newFormatter();

        System.out.println("Formatted numbers: " + formatter.format(resultNumbers));
    }

    private Runnable newRunnable() {
        return () ->  System.out.println("Runnable!");
    }

    private Calculator newCalculator(){
        return number -> number * number;
    }

    private Consumer newConsumer(){
        return System.out::println; //(Object t) -> System.out.println(t);
    }

    private Formatter newFormatter(){
        return (List<Integer> numbers) -> numbers.stream()
                                                 .map(String::valueOf)
                                                 .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        LegacyRefactoring fact = new LegacyRefactoring();
        fact.legacy();
    }
}
