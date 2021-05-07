package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        char[] a = str.toCharArray();
        int count = 0;
        boolean flag = true;

        System.out.println("---------\n" +
                "| " + a[0] + " " + a[1] + " " + a[2] + " |\n" +
                "| " + a[3] + " " + a[4] + " " + a[5] + " |\n" +
                "| " + a[6] + " " + a[7] + " " + a[8] + " |\n" +
                "---------");
        int sum = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7] + a[8];
        for (int i = 0; i < 6; i = i + 3) {

            int x = a[i] + a[i + 1] + a[i + 2];
            int c = a[0 + count] + a[count + 3] + a[count + 6];
            int k = a[2] + a[5] + a[8];
            int d = a[0] + a[4] + a[8];
            int v = a[2] + a[4] + a[6];

            count++;
            if (sum != 779) {
                if (x == 264 || d == 264 || v == 264 || c == 264 || k == 264) {
                    System.out.println("X wins");
                    flag = false;
                    break;
                } else if (x == 237 || d == 237 || v == 237 || c == 237 || k == 237 && sum != 779) {
                    System.out.println("O wins");
                    flag = false;
                    break;
                }
            }
        }


        if (sum <= 786 && sum >= 786 && flag) {
            System.out.println("Game not finished");

        } else if (flag && sum > 755 && sum != 779 && sum != 818 && sum != 777) {
            System.out.println("Draw");

        } else if (flag) {
            System.out.println("Impossible");
        }


    }
 }
