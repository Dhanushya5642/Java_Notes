import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        int [] arr1=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("values in int array:");
        for(int a:arr){
            System.out.print(a+" ");
        }
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        arr1=Arrays.copyOf(arr, size);
        System.out.println("values in int array:");
        for(int a:arr1){
            System.out.print(a+" ");
        }
    }
}
