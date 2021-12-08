package Lamp;

public class Main {
    public static void main(String[] args) {
        Lamp lamp[] = new Lamp[4];
        lamp[0] = new Lamp(45, 200, "Osram");
        lamp[1] = new Lamp(60, 710, "GE");
        lamp[2] = new LedLamp(5, 470, "Phillips", "White", 4500);
        lamp[3] = new LedLamp(12, 1521, "Lexman");
        for (int i = 0; i < lamp.length; i++) {
            System.out.println(lamp[i].lightOutput());
        }
    }
}
