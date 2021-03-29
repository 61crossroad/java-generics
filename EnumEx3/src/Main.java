enum Transportation {
    BUS(100) {
        int fare(int distance) { return distance * BASIC_FARE; }
    },
    TRAIN(150) {
        int fare(int distance) { return distance * BASIC_FARE; }
    },
    SHIP(100) {
        int fare(int distance) { return distance * BASIC_FARE; }
    },
    AIRPLANE(300) {
        int fare(int distance) { return distance * BASIC_FARE; }
    };

    protected final int BASIC_FARE; // must be protected

    Transportation(int basicFare) {
        BASIC_FARE = basicFare;
    }

    public int getBasicFare() { return BASIC_FARE; }

    abstract int fare(int distance);
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("bus fare = " + Transportation.BUS.fare(100));
        System.out.println("train fare = " + Transportation.TRAIN.fare(50));
        System.out.println("ship fare = " + Transportation.SHIP.fare(100));
        System.out.println("airplane fare = " + Transportation.AIRPLANE.fare(200));
    }
}
