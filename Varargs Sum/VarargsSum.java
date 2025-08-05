import java.util.Scanner;
public class VarargsSum {
    static int varargssum(int... arr){
        int sum = 0;
        for (int i : arr){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of numbers to sum: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.printf("Enter the %dth number: ",i+1);
            arr[i]=in.nextInt();
        }
        System.out.printf("The Total is %d", varargssum(arr));
        in.close();
    }
}
