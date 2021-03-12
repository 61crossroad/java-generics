import java.util.ArrayList;
import java.util.List;

class Fruit {
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

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return "Juice{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";

        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }

        return new Juice(tmp);
    }
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    List<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    List<T> getList() { return list; }
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

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}
