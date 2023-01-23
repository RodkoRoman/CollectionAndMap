package org.rodko;

import java.util.HashMap;
import java.util.Map;

public class PetMap {
    Map<String, Pet> petMap = initPetMAp();

    public void printPetName() {
        System.out.println("\nЗадание: \n" +
                "1.Создайте класс Pet и его наследников Cat, Dog, Parrot.\n" +
                "2.Создайте отображение из домашних животных, где в качестве ключа выступает имя животного," +
                " а вкачестве значения класс Pet.\n" +
                "3.Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения\n");
        System.out.println("Имена животных: " + petMap.keySet());
    }


    private Map<String, Pet> initPetMAp() {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("Бобик", new Dog());
        petMap.put("Жучка", new Dog());
        petMap.put("Хатико", new Dog());
        petMap.put("Васька", new Cat());
        petMap.put("Кузя", new Cat());
        petMap.put("Мурка", new Cat());
        petMap.put("Кеша", new Parrot());
        petMap.put("Честер", new Parrot());
        petMap.put("Черныш", new Parrot());
        return petMap;
    }
}
