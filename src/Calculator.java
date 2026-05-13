import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new; // Получение экземпляра класса Calculator

    // Математические операции
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    // Математических операций над одним числом
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    // Определение положительное ли число
    Predicate<Integer> isPositive = x -> x > 0;

    // Вывода числа в консоль, с использованием ссылкы на статический метод "println():"
    Consumer<Integer> println = System.out::println;
}
