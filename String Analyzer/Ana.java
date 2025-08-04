import java.util.Scanner;
public class Ana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an String: ");
        String a = in.nextLine();
        System.out.printf("Length: %d", a.length());
        System.out.println();
        if (a.length() <= 3) {
            System.out.printf("First 3 letters are: %s", a);
            System.out.println();
        }
        else{
            System.out.print("First 3 letters are: ");
            for(int i=0; i<3; i++){
                System.out.print(a.charAt(i));
            }
            System.out.println();
        }
        System.out.print("Reverse: ");
        for(int i=a.length()-1; i>=0; i--){
            System.out.print(a.charAt(i));
        }
        System.out.println();
        in.close();
    }
}
