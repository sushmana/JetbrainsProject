import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        String inputLine = s.nextLine();
        String[] strArray = inputLine.split(" ");
        boolean asc = true; // start with presupposed ascending
        for (int i = 1; i < strArray.length; i++) {
            if (strArray[i - 1].compareTo(strArray[i]) > 0) {
                asc = false;
                break;
            }
        }
        System.out.println(asc);
    }
}