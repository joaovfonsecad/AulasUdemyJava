package academy.learnprogramming;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResoluion;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResoluion) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResoluion = nativeResoluion;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResoluion() {
        return nativeResoluion;
    }
}
