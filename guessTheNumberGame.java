package com.company;
import java.util.Scanner;
import java.util.Random;
class game{
    public int computerInput;
    public int userInput;
    public int noOfGuesses;
    game(){
        Random rand = new Random();
        this.computerInput=rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Choose a Number");
        Scanner scanner=new Scanner(System.in);
        userInput= scanner.nextInt();
    }
    boolean isCorrect(){
        noOfGuesses++;
        if(userInput==computerInput){
            System.out.format("Yes you guessed it Right, it was %d \n",computerInput);
            return true;
        }
        else if (userInput<computerInput){
            System.out.println("Too Low...");
        }
        else {
            System.out.println("Too High..");
        }
        return false;

    }
}

public class guessTheNumberGame {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while (!b){
            g.takeUserInput();
            b= g.isCorrect();
        }
    }
}
