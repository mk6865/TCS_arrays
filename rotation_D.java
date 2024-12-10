
import java.util.Scanner;



public class rotation_D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the arrray");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the number of times you want to rotate the array");
            int d = sc.nextInt();
            d %= n;
            reverse(arr,0,d-1);
            reverse(arr,d,n-1);
            reverse(arr,0,n-1);
            for(int num:arr){
                System.out.print(num+" ");
            }
        }
    }
    public static void reverse(int[] arr, int start,int end){
        while(start<end){
            int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
        }
    }
}
