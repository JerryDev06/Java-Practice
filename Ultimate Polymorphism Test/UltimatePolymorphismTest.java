import java.util.Scanner;
abstract class animal{
    abstract void dog();
}
interface Pet{
    void cat();
}
class catsanddogs extends animal implements Pet{
    String name1, name2;
    catsanddogs(Scanner in){
        System.out.print("Enter the name of your dog: ");
        this.name1 = in.nextLine();
        System.out.print("Enter the name of your cat: ");
        this.name2 = in.nextLine();;
    }
    void dog(){
        System.out.println("Your dog name is " + this.name1);
    }
    public void cat(){
        System.out.println("Your cat name is " + this.name2);
    }
}
public class UltimatePolymorphismTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of pets you have : ");
        int n = in.nextInt();
        in.nextLine();
        catsanddogs[] arr = new catsanddogs[n];
        for(int i=0; i<n; i++){
            arr[i] = new catsanddogs(in);
        }
        for(catsanddogs i : arr){
            i.dog();
            i.cat();
        }
        in.close();
    }
}
