import java.util.Scanner;
public class Arraystatus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = in.nextInt();
        }
        int min = arr[0], max = arr[0];
        double avg = 0.0;
        for(int i=0; i<n; i++){
            avg+=arr[i];
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.printf("Min: %d \nMax: %d \nAvg: %.2f",min,max,avg/n);
        in.close();
    }
}
