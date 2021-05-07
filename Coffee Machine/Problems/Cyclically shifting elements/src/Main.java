import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length=scanner.nextInt();

        int[] arr=new int[length];
        int[] arr2=new int[length];

        for(int i=0;i<length;i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < 1; i++){
            int j, last;
            //Stores the last element of array
            last = arr[arr.length-1];

            for(j = length-1; j > 0; j--){
                //Shift element of array by one
                arr[j] = arr[j-1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }

        System.out.println();

        //Displays resulting array after rotation

        for(int i = 0; i< length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}