package Week3;

import java.util.function.DoubleUnaryOperator;

/**
 * Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле левых прямоугольников.
 * <p>
 * Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator.
 * Его метод applyAsDouble() принимает значение аргумента и возвращает значение функции в заданной точке.
 * <p>
 * Интервал интегрирования задается его конечными точками a и b, причем a <= b.
 * Для получения достаточно точного результата используйте шаг сетки не больше 10−6.
 * <p>
 * Пример. Вызов
 * <p>
 * integrate(x -> 1, 0, 10)
 * должен возвращать значение 10.
 */
public class Integral {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double dx = 0.0000001;
        double sum = 0.0;
        for (double x = a; x < b; x += dx) {
            sum += f.applyAsDouble(x) * dx;
        }
        return sum;
    }

}
