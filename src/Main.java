public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        // сложение переданных переменных => 1 + 2 = 3
        int a = calc.plus.apply(1, 2);
        // разница переданных переменных => 1 - 1 = 0
        int b = calc.minus.apply(1,1);
        // частное переданных переменных => 3 делим на 0 и математическая ошибка
        int c = calc.devide.apply(a, b);

        // вывод частного - для данного примера до данной строки исполнение не дойдет
        calc.println.accept(c);

        // Для исправления добавляем тернарный оператор - где при делении на 0 возвращаем максимально возможный результат
    }
}
