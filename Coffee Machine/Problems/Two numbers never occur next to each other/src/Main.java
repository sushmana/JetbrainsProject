import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //size of an array
        int length=scanner.nextInt();
        //elements of an array
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=scanner.nextInt();
        }
        //two integer number n and m
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        boolean patternExists = true;
        //Check if n and m are together or not

        for(int i=0;i<length;i++){
            if(arr[i]==n){
                if((arr[Math.max((i-1),0)]==m) || (arr[Math.min((i+1),length-1)]==m)){
                    patternExists = false;
                    break;
                }
            }
        }
        System.out.println(patternExists);
    }
}