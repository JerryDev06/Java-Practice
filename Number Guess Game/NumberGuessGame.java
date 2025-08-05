import java.util.*;
public class NumberGuessGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Guess an number between 1 to 10: ");
        int n = in.nextInt();
        int ran = r.nextInt(1,11);
        if(n<1 || n>10){
            System.out.println("Invalid input");
            return;
        }
        if (ran==n){
            System.out.println("You are right!");
        }
        else{
            System.out.printf("You are Wrong! The number is %d",ran);
        }
        in.close();
    }
}
