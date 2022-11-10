package simple;

public class SimpleClass {
    public static void main(String[] args) {
        Pen pen=new Pen(Colors.Pink);
        System.out.println(pen.getColor());

        Car car= new Car(Colors.Red);
        System.out.println(car.toString());
        Mixer mixer=new Mixer();
        mixer.setValues(5,5);
        System.out.println(mixer.getTemp());
    }
}

