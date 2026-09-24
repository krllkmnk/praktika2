package org.example;

import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        // вывод красивый
        int[] array = {1,2,3,4,5};
        System.out.println("Массив:");
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();

        // Меню
        System.out.println("1 - Добавить элемент");
        System.out.println("2 - Удалить элемент");
        int choice = scanner.nextInt();
        if (choice != 1 && choice != 2) {
            System.out.println("Неверный выбор, введите 1 или 2");
            return;
        }
        // Выбор меню нумеро уно
        if (choice == 1) {
            System.out.println("Введите целое число: ");
            int number = scanner.nextInt();
            // Создаем массив с +1 местом
            int[] newArray = new int[array.length + 1];
            // Перенос значений с array в newArray
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[newArray.length - 1] = number;
            array = newArray;
            // Вывод красивый
            System.out.println("Массив:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
            System.out.println();
        }
        // Выбор нумеро ту
        if (choice == 2) {
            System.out.println("Введите номер в массиве для удаления (индекс от 0 до " + (array.length - 1) + "):");
            int index = scanner.nextInt();
            if (index < 0 || index >= array.length) {
                System.out.println("Выбор вне массива");
                return;
            }

            int[] newDeleteArray = new int[array.length - 1];
            int newI = 0;

            for (int i = 0; i < array.length; i++) {
                if (i != index) { // Копируем все элементы но элемент который выбрали нет
                    newDeleteArray[newI] = array[i];
                    newI++;
                }
            }
            array = newDeleteArray;
        }

            System.out.println("Обновленный массив:");
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        }
    }

