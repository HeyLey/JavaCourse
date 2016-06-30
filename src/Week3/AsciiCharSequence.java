package Week3;

import java.lang.reflect.Array;

/**
 * Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов
 * (их коды влезают в один байт) в массиве байт.
 * По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.

 Класс AsciiCharSequence должен:

 реализовывать интерфейс java.lang.CharSequence;
 иметь конструктор, принимающий массив байт;
 определять методы length(), charAt(), subSequence() и toString()
 Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).

 В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры,
 поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.

 P.S. В Java 9 ожидается подобная оптимизация в самом классе String: http://openjdk.java.net/jeps/254
 */
public class AsciiCharSequence implements CharSequence {

    byte[] asciiChars;

    public AsciiCharSequence(byte[] asciiChars) {
        this.asciiChars = asciiChars;
    }

    @Override
    public int length() {
        return asciiChars.length;
    }

    @Override
    public char charAt(int i) {
        byte c = asciiChars[i];
        return (char)c;
    }

    @Override
    public CharSequence subSequence(int i, int j) {
        StringBuilder s = new StringBuilder();
        for ( ; i < j; i++) {
            s.append((char)asciiChars[i]);
        }
        return s;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < asciiChars.length; i++) {
            s.append((char)asciiChars[i]);
        }
        return s.toString();
    }
}

class Run {
    public static void main(String[] args) {
        byte[] chars = {'e', 'v', 'g', 'e', 'n', 'y'};
        AsciiCharSequence acs = new AsciiCharSequence(chars);
        System.out.println(acs.toString());
        System.out.println(acs.subSequence(3, 5));
        System.out.println(acs.length());
        System.out.println(acs.charAt(0));
    }
}
