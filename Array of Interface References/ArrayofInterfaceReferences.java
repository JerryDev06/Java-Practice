import java.util.Scanner;
interface Flyable{
    String Fly();
}
class Bird implements Flyable{
    public String Fly(){
        return "I can fly without white petrol because i am a bird :)";
    }
    @Override
    public String toString(){
        return Fly();
    }
}
class Aeroplane implements Flyable{
    public String Fly(){
        return "I can't fly without white petrol because i am a Aeroplane :(";
    }
    @Override
    public String toString(){
        return Fly();
    }
}
public class ArrayofInterfaceReferences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Flyable[] arr = new Flyable[2];
        arr[0] = new Bird();
        arr[1] = new Aeroplane();
        for (Flyable i : arr){
            System.out.println(i);
        }
        in.close();
    }
}
