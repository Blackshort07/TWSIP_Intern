import java.util.*;
import java.util.Random;

class numberGuess{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int lowerValue = 1;
        int upperValue = 100;
        int numberToGuess = rd.nextInt(upperValue - lowerValue + 1) + lowerValue;
        int numberOfAttempt = 0;
        boolean hasGuessedCurrectly = false ;


            System.out.println("Welcome To Number Gussing Game ");
            System.out.println("You Will Be Asked To Guess A Number To Win The Game ");
            System.out.println("You Have Maximum 5 Attempt Limit");
           // System.out.println("Enter a guess number between 1 to 100 : ");
            
            while(!hasGuessedCurrectly && numberOfAttempt <5){
                System.out.println("Enter Your Guess Between 1 To 100 ");
                int userGuess = sc.nextInt();
                numberOfAttempt++ ;

               if(userGuess == numberToGuess){
                hasGuessedCurrectly = true;
               }else if(userGuess < numberToGuess){
                System.out.println("Try a higher number.");
               }else if(userGuess > numberToGuess){
                System.out.println("Try a lower number");
               }
            }
               if(hasGuessedCurrectly){
                System.out.println("Congratulation! You've guessed the correct number" + " in "  + numberOfAttempt +"th attempt.");
               }else{
                System.out.println("Sorry!! you are unable to guess the number and the number is " +  numberToGuess + ".");
               }

       

    }
}