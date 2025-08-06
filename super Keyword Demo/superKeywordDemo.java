import java.util.*;
class Vehicle{
    double speed;
    Vehicle(){
        Scanner in = new Scanner(System.in);
        System.out.print("What tis the Speed of the car: ");
        this.speed = in.nextDouble();
        in.close();
    }
    void showSpeed(){
        System.out.println("Vanakam From Parent, The speed is: "+this.speed+"Km/hr");
    }
}
class Car extends Vehicle{
    Car(){
        super();
    }
    @Override
    void showSpeed(){
        System.out.println("Vanakam From Child, The speed is: "+this.speed+"Km/hr");
        super.showSpeed();
    }
}
public class superKeywordDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.showSpeed();
    }
}
