package org.rodko;

import java.util.HashMap;
import java.util.Map;

public class ProductMap {
    Map<String, Product> productMap = initProductMap();
    String task = "\nЗадание: \n" +
            "1.Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).\n" +
            "2.Перебрать и распечатать пары значений - entrySet().\n" +
            "3.Перебрать и распечатать набор из имен продуктов  - keySet().\n" +
            "4.Перебрать и распечатать значения продуктов - values().\n" +
            "5.Для каждого перебора создать свой метод.";

    public void printAllMethods() {
        System.out.println(task);
        printEntrySetProductMap(productMap);
        printKeySetProductMap(productMap);
        printValuesProductMap(productMap);
    }

    private void printEntrySetProductMap(Map<String, Product> productMap) {
        System.out.println("\nПары значений: ");
        productMap.entrySet().forEach(System.out::println);
    }

    private void printKeySetProductMap(Map<String, Product> productMap) {
        System.out.println("\nИмена Продуктов: ");
        productMap.keySet().forEach(System.out::println);
    }

    private void printValuesProductMap(Map<String, Product> productMap) {
        System.out.println("\nЗначения продуктов: ");
        productMap.values().forEach(System.out::println);
    }

    private Map<String, Product> initProductMap() {
        Map<String, Product> productMap = new HashMap<>();
        productMap.put("Машинка", new Product(1200));
        productMap.put("Поезд", new Product(3000));
        productMap.put("Мишка", new Product(1500));
        productMap.put("Кукла", new Product(800));
        productMap.put("Лего", new Product(7000));
        return productMap;
    }
}
