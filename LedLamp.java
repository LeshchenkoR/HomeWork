package Lamp;

public class LedLamp extends Lamp {
    private String color;
    private int lightTemp;

    public LedLamp(int power, int brightness, String manufacturer, String color, int lightTemp) {
        super(power, brightness, manufacturer);
        this.color = color;
        this.lightTemp = lightTemp;
    }

    public LedLamp(int power, int brightness, String manufacturer) {
        super(power, brightness, manufacturer);
    }

    void features() {
        System.out.println("Цвет " + color + ", температура света" + lightTemp);
    }

}
