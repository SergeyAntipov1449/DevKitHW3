package org.example;

//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
//        sum(), multiply(), divide(), subtract(). Параметры этих методов – два
//        числа разного типа, над которыми должна быть произведена операция.
public class Calc {
    public static <T extends Number, V extends Number> double sum(T num1, V num2) {

        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T num1, V num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T num1, V num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtract(T num1, V num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}
