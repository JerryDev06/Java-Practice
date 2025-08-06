import java.util.*;
class Dog{
    Dog(){
        System.out.println("Stray Dog");
    }
    Dog(String d){
        System.out.println("Dog name: "+d);
    }
}
public class OverloadedConstructors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a dog name and i will repeat it, if failed so your dog is a stray dog: ");
        String d = in.nextLine();
        if(d.isEmpty()){
            Dog dog = new Dog();
        }
        else{
            Dog dog = new Dog(d);    
        }
        in.close();
    }
}
