package org.example;
//Напишите обобщенный метод compareArrays(),
//        который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
//        Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.

public class ArrayComparator {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if ((array1.length != array2.length) && (array1[0].getClass() != array2[0].getClass())) {
            return false;
        }
        return true;
    }
}
