package Java_for_dummies;

import java.util.Random;
import java.util.Scanner;

public class CasinoGame {

    public static void main(String[] args) {

        int playerMoney = 100;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("welcome to the Casino game");
        System.out.println();
        System.out.println("The Game is Simple set a amount of money");
        System.out.println("Then you pick a number between 1 and 10 and if your Answer ");
        System.out.println("is Correct you get your money + 50% you set ");
        System.out.println("Your Current Balance is: " + playerMoney + "$");

        System.out.print("enter how much money you would like to bet: ");
        int moneyBet = keyboard.nextInt();

        playerMoney -= moneyBet;

        if (playerMoney < 0) {
            System.out.println("You have not enough money");
            System.out.println("Pleas Try Again: ");
            moneyBet = keyboard.nextInt();

            moneyBet = 0;
            playerMoney = 100;

        }
        else  {
            System.out.println("your bet is: " + moneyBet + "$");
            System.out.println("Your Balance is: " + playerMoney + "$");

            System.out.print("Pleas Enter a Number between 1 and 10: ");
            int imputNumber = keyboard.nextInt();
            int randomNumber = new Random().nextInt(10) + 1;

            if (randomNumber == imputNumber) {
                System.out.println("yor answer is Correct you get your money + 50% you set ");
                moneyBet += 50 %moneyBet;
                playerMoney += moneyBet;
                moneyBet = 0;

                System.out.println("your Balance is: " + playerMoney + "$");
                System.out.println("Your bet is: " + moneyBet + "$");
            }
            else {
                System.out.println("You Lose. you Guess the Wrong Number");
                System.out.println("The Number was: " + randomNumber );
                moneyBet = 0;

                System.out.println("your Balance is: " + playerMoney + "$");
                System.out.println("Your bet is: " + moneyBet + "$");
            }

            keyboard.close();
        }

    }
}
