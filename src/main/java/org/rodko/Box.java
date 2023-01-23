package org.rodko;

public class Box {

    int weight;
    int height;
    int width;
    int depth;

    public Box(int weight, int height, int width, int depth) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Вес = " + weight + ", высота = " + height + ", ширина = " + weight + ", глубина = " + depth;
    }

    public int getWeight() {
        return weight;
    }
}
