package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery source = new Battery(50);
        Battery battery = new Battery(50);
        battery.exchange(source);
        System.out.println("Заряд источника: " + source.getLoad() + "\n" +
                "Заряд получателя: " + battery.getLoad());
    }
}
