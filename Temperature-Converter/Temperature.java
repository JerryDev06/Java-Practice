import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int n = in.nextInt();
        switch(n){
            case 1 ->{
                System.out.print("Enter the Temperature value in Celsius: ");
                double c = in.nextDouble();
                System.out.printf("Temperature = %.2f F",((c*9.0/5)+32.0));
            }
            case 2 ->{
                System.out.print("Enter the Temperature value in Fahrenheit: ");
                double f = in.nextDouble();
                System.out.printf("Temperature = %.2f C",((f-32.0)*5/9));
            }
            default -> System.out.println("Invalid input");
        }
        in.close();
    }
}
