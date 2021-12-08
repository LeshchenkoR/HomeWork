package Lamp;

 public class Lamp {
    private int power;
    private int brightness;
    private String manufacturer;

    public Lamp(int power, int brightness, String manufacturer) {
        this.power = power;
        this.brightness = brightness;
        this.manufacturer = manufacturer;
    }

    public String lightOutput() {
        return "Cветоотдача составляет "  + (brightness / power) + " Люмен/Вт";
    }
    public void showParameter(){
        System.out.println("Мощность - " + power + ", яркость - " + brightness);
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getPower() {
        return power;
    }
    public int getBrightness() {
        return brightness;
    }
    public String getManufacturer() {
        return manufacturer;
    }
}
