import java.util.*;
class Employee{
    String name;
    Employee(Scanner in){
        name = in.nextLine();
    }
    @Override
    public String toString(){
        return "So your name is "+name+". That will be easy to remember :)";
    }
}
public class MethodOverridingwithtoString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Got a Name ? : ");
        Employee e = new Employee(in);
        System.out.println(e);
        in.close();
    }
}
