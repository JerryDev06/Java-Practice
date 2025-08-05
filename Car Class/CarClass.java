import java.util.*;
class Car{
    String brand;
    String model;
    int year;
    Car(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    @Override
    public String toString() {
        return "Brand = "+brand+"\nModel = "+model+"\nYear = "+year;
    }
}
public class CarClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        Car[] car = new Car[3];
        System.out.println("Eneter the car details for any 3 cars of your choice");
        while(n<3){
            System.out.print("Enter car Brand: ");
            String brand = in.nextLine();
            System.out.print("Enter car Model: ");
            String model = in.nextLine();
            System.out.print("Enter car Year: ");
            int year = in.nextInt();
            car[n]= new Car(brand,model,year);
            in.nextLine();
            n++;
        }
        for(Car i : car){
            System.out.println(i);
        }
        in.close();
    }
}
