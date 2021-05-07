package machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("The coffee machine has:");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int water = 400;
//        System.out.println(water + " " + "of water");
        int milk = 540;
//        System.out.println(milk + " " + "of milk");
        int coffee = 120;
//        System.out.println(coffee + " " + "of coffee beans");
        int cups = 9;
//        System.out.println(cups + " " + "of disposable cups");
        int money = 550;
//        System.out.println(money + " " + "of money");
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = bf.readLine();

        while (!action.equals("exit")) {

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");

                    String st=bf.readLine();

                    if(st.equals("back")){
                        break;
                    }


                    int b = Integer.parseInt(st);
                    boolean coffeeReady=true;
                    if (b == 1) {
                        if (water < 250) {
                            coffeeReady=false;
                            System.out.println("Sorry, not enough water!");
                        }
                        if (coffee < 16) {
                            coffeeReady=false;
                            System.out.println("Sorry, not enough coffee!");
                        }
                        if (cups < 1) {
                            coffeeReady=false;
                            System.out.println("Sorry, not enough cups!");
                        }
                        if(coffeeReady){
                            water -= 250;
                            coffee -= 16;
                            cups -= 1;
                            money += 4;
                        }
                    } else if (b == 2) {
                        if (water < 350) {
                            coffeeReady=false;
                            System.out.println("Sorry, not enough water!");
                        }
                        if(milk<75){
                            coffeeReady=false;
                            System.out.println("Sorry, not enough milk!");
                        }
                        if (coffee < 20) {
                            coffeeReady=false;
                            System.out.println("Sorry, not enough coffee!");
                        }
                        if (cups < 1) {
                            coffeeReady=false;
                            System.out.println("Sorry, not enough cups!");
                        }
                        if(coffeeReady){
                            water -= 350;
                            milk -= 75;
                            coffee -= 20;
                            cups -= 1;
                            money += 7;
                        }
                    } else if (b == 3) {
                        if (water < 200) {
                            coffeeReady=false;
                            System.out.println("Sorry, not enough water!");
                        }
                        if (milk < 100){
                            coffeeReady=false;
                            System.out.println("Sorry, not enough coffee!");
                        }

                        if (coffee < 12){
                            coffeeReady=false;
                            System.out.println("Sorry, not enough coffee!");
                        }
                        if (cups < 1)  {
                            coffeeReady = false;
                            System.out.println("Sorry, not enough cups!");
                        }
                        if(coffeeReady){
                            water -= 200;
                            milk -= 100;
                            coffee -= 12;
                            cups -= 1;
                            money += 6;
                        }

                    }
                    if(coffeeReady){
                        System.out.println("I have enough resources, making you a coffee!");
                    }
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " " + "of water");
                    System.out.println(milk + " " + "of milk");
                    System.out.println(coffee + " " + "of coffee beans");
                    System.out.println(cups + " " + "of disposable cups");
                    System.out.println("$"+money + " " + "of money");
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int addWater = Integer.parseInt(bf.readLine());
                    System.out.println("Write how many ml of milk do you want to add:");
                    int addMilk = Integer.parseInt(bf.readLine());
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int addCoffee =  Integer.parseInt(bf.readLine());
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int addCups =  Integer.parseInt(bf.readLine());
                    water += addWater;
                    milk += addMilk;
                    coffee += addCoffee;
                    cups += addCups;

                    break;
                case "take":
                    System.out.println("I gave you" + " " + "$" + money);
                    money=0;
//                    System.out.println("The coffee machine has:");
//
//                    System.out.println(water + " " + "of water");
//                    System.out.println(milk + " " + "of milk");
//                    System.out.println(coffee + " " + "of coffee beans");
//                    System.out.println(cups + " " + "of disposable cups");
//                    System.out.println("0" + " " + "of money");
                    break;

            } System.out.println("Write action (buy, fill, take, remaining , exit):");

            action =  bf.readLine();


        }
    }
}