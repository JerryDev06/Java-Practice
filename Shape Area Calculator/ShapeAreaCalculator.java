import java.util.*;
interface Shape{
    void area();
}
class Circle implements Shape{
    double r;
    Circle(Scanner in){
        System.out.print("Enter the radius of the Circle: ");
        this.r = in.nextDouble();
    }
    @Override
    public void area(){
        System.out.printf("Area : %.2f",this.r*this.r*3.14);
    }
}
class Rectangle implements Shape{
    double l, b;
    Rectangle(Scanner in){
        System.out.print("Enter the length of the Rectangle: ");
        this.l = in.nextDouble();
        System.out.print("Enter the bredth of the Rectangle: ");
        this.b = in.nextDouble();
    }
    @Override
    public void area(){
        System.out.printf("Area : %.2f",this.l*this.b);
    }
}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select any shape from these to find its area\n1. Rectangle\n2. Circle");
        System.out.print("Your choice: ");
        int n = in.nextInt();
        if(n==1){
            Rectangle r = new Rectangle(in);
            r.area();
        }
        else if(n==2){
            Circle c = new Circle(in);
            c.area();
        }
        else{
            System.out.println("Invalid input");
        }
        in.close();
    }
}
