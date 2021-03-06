package academy.learnprogramming;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double lenght) {
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }

        if (lenght < 0) {
            this.length = 0;
        } else {
            this.length = lenght;
        }
    }

    public double getArea(){
        return this.width * this.length;
    }
}
