package Number.Guessing.Game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    NumberGuessingGame(){
        int numberOfGuesses = 0;
        Random random=new Random();
        int number= random.nextInt(100);
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------------------G-A-M-E--------------------");
        System.out.println();

        for (int i=0;i<=10;i++){
            System.out.print("Guess the number : ");
            numberOfGuesses++;
            int userInput=sc.nextInt();
            if (userInput<number){
                System.out.println("You are under guessing the number.");
                try {
                    Thread.sleep(1500);
                    System.out.println("Please Try again!");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (userInput==number){
                System.out.print("Hooray");
                try {
                    int n=0;
                    while (n<5){
                        System.out.print("!");
                        Thread.sleep(800);
                        n++;
                    }
                    Thread.sleep(2000);
                    System.out.println("\nYou guess the correct number ");
                    Thread.sleep(1500);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("Yes it is the number "+number+" and you guessed it in "+numberOfGuesses+" times.");
                int score=100;
                score = score - numberOfGuesses*10;
                System.out.println("Your score is "+score);
                return;
            }
            else {
                System.out.println("You are over guessing the number.");
                try {
                    Thread.sleep(1500);
                    System.out.println("Please Try again!");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Your chances are over.");
        try {
            Thread.sleep(1500);
            System.out.println("Better luck next time!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new NumberGuessingGame();
    }

}
