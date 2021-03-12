import java.util.ArrayList;
import java.util.List;

class Fruit implements Eatable {
    @Override
    public String toString() {
        return "Fruit{}";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple{}";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape{}";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy{}";
    }
}

interface Eatable {}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    List<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return "Box{" +
                "list=" + list +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        grapeBox.add(new Grape());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);
    }
}
