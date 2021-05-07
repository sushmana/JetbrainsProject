import java.util.Scanner;
import java.lang.*;
import java.lang.System;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        String op=sc.next();
        long b=sc.nextLong();

        if(op.equals("+")){
            System.out.println(a+b);
        }

        else if(op.equals("-")){
            if(a>b){
                System.out.println(a-b);
            }
            else{
                System.out.println(b-a);
            }
        }

        else if(op.equals("*")){
            System.out.println(a*b);
        }

        else if(op.equals("/")) {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Division by 0!");
            }
        }
        else{
            System.out.println("Unknown operator");
        }

    }
}