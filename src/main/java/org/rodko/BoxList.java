package org.rodko;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BoxList {
    List<Box> initList = initializeList();
    String task = "Задание: \n" +
            "1.Создать ArrayList, содержащий объекты Box. (Объект Box имеет поля: вес, высота, широта, глубина)\n" +
            "2.Написать метод, который перебирает элементы коллекции и проверяет вес коробок.\n" +
            "3.Если вес коробки больше 300 гр,коробка перемещается в другую коллекцию.\n";

    public void printListsInformation() {
        System.out.println(task);
        printInitList(initList);
        List<Box> heavyBoxList = weightSorted(initList);
        printHeavyBox(heavyBoxList);
        printLightBox(initList);
    }

    private void printInitList(List<Box> initList) {
        System.out.println("Коробки до сортировки по весу:");
        initList.forEach(System.out::println);
    }

    private void printHeavyBox(List<Box> heavyBoxList) {
        System.out.println("\nКоробки, которые весят > 300 гр:");
        heavyBoxList.forEach(System.out::println);
    }

    private void printLightBox(List<Box> initList) {
        System.out.println("\nКоробки весящие <= 300 гр:");
        initList.forEach(System.out::println);
    }

    private List<Box> weightSorted(List<Box> initList) {
        List<Box> heavyBoxList = initList.stream()
                .filter(box -> box.getWeight() > 300)
                .collect(toList());
        initList.removeAll(heavyBoxList);
        return heavyBoxList;
    }

    private List<Box> initializeList() {
        List<Box> boxList = new ArrayList<>();
        boxList.add(new Box(250, 100, 50, 60));
        boxList.add(new Box(500, 170, 70, 70));
        boxList.add(new Box(200, 150, 80, 50));
        boxList.add(new Box(450, 120, 90, 80));
        boxList.add(new Box(300, 140, 70, 60));
        boxList.add(new Box(100, 190, 50, 70));
        boxList.add(new Box(150, 110, 50, 80));
        boxList.add(new Box(600, 180, 60, 50));
        boxList.add(new Box(200, 130, 90, 60));
        boxList.add(new Box(350, 160, 60, 90));
        return boxList;
    }


}
