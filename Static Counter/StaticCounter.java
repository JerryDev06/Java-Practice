import java.util.*;
class Student{
    static int count = 0;
    Student(){
        count++;
    }
}
public class StaticCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the names of the students, 0 to stop");
        String n;
        while (true) {
            System.out.print("Student Name: ");
            n = in.nextLine();
            switch(n){
                case "0" ->{
                    in.close();
                    System.out.printf("There are totally %d Students",Student.count);
                    return;
                }
                default -> {
                    new Student();
                }
            }
        }
    }
}
