package Calculator;

import java.util.Scanner;

//Создайте проект, используя IntelliJ IDEA. Создайте класс Calculator.
// В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание, mul – умножение, div – деление).
// Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать исключение.
// ользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При возникновении ошибок должны выбрасываться исключения.
public class Calculator {

    public int add(int num, int num1) {
        return num + num1;
    }

    public int sub(int num, int num1) {
        return num - num1;
    }

    public int mul(int num, int num1) {
        return num * num1;
    }

    public int div(int num, int num1) {


        try {
            return num / num1;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");

        }


        return 0;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num = scanner.nextInt();


        System.out.println("Введите второе число:");
        int num1 = scanner.nextInt();


        System.out.println("Введите операцию: ( +  -  *  / )");
        String calc = scanner.next();
        if (calc.equals("+"))
            System.out.println(calculator.add(num, num1));

        if (calc.equals("-"))
            System.out.println(calculator.sub(num, num1));
        if (calc.equals("*"))
            System.out.println(calculator.mul(num, num1));
        if (calc.equals("/"))
            System.out.println(calculator.div(num, num1));


    }
}