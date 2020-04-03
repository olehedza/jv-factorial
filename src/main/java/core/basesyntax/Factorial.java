package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        return number < 2 ? 1
                : number * getFactorial(number - 1);
    }
}
