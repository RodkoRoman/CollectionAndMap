package org.rodko;

public class Product {
//    Создать HashMap
//    1.    Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
//    2.    Перебрать и распечатать пары значений - entrySet().
//    3.    Перебрать и распечатать набор из имен продуктов  - keySet().
//    4.    Перебрать и распечатать значения продуктов - values().
//    5.    Для каждого перебора создать свой метод.
    int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Цена: " + price;
    }
}
