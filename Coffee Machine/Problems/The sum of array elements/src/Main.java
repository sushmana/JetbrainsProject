import java.lang.reflect.Array;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int sum=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}