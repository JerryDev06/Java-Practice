import java.util.*;
abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog goes Woof");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat goes Meow");
    }
}
public class AnimalSounds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Animal[] arr = new Animal[2];
        arr[0] = new Dog();
        arr[1] = new Cat();
        in.close();
        for (Animal i : arr){
            i.sound();
        }
    }
}
