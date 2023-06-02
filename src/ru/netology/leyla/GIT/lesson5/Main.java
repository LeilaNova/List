package ru.netology.leyla.GIT.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> purchases = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию: ");
            System.out.println("1. Добавить\n2. Показать\n3. Удалить");
            String input = scanner.nextLine();

            switch (input) {
                case "1": {
                    System.out.println("Какой товар хотите добавить? Введите номер или название");
                    purchases.add(scanner.next());
                    break;
                }
                case "2": {
                    orderHistory(purchases);
                    break;
                }
                case "3": {
                    orderHistory(purchases);
                    System.out.println("Какую покупку хотите удалить? Введите номер или название");
                    String orderData = scanner.next();

                    try {
                        int data = Integer.parseInt(orderData) - 1;
                        purchases.remove(data);
                    } catch (Exception e) {
                        purchases.remove(orderData);
                    }
                }
                default: {
                    System.out.println("Ошибка! Ввод номера операции от 1-3");
                }
            }
        }
    }

    private static void orderHistory(List<String> purchases) {
        System.out.println("Список покупок:");
        for (int i = 0; i < purchases.size(); i++) {
            int count = i + 1;
            System.out.println(count + " " + purchases.get(i));
        }
    }
}

