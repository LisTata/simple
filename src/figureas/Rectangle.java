package figureas;

public class Rectangle extends Figure {
    private double a;
    private double b;



    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double length() {
        return 0;
    }
}

