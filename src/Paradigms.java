import figureas.Circle;
import figureas.Rectangle;

public class Paradigms {

    public static void main(String[] args) {

        Circle circle = new Circle();
        for (int i = 0; i < 3; i++) {
            circle.setRadius(i + 1);
            System.out.println(circle.area());
        }
        Rectangle rectangle=new Rectangle();
        rectangle.setA(1);
        rectangle.setB(2);
        System.out.println(rectangle.area());
    }


}

