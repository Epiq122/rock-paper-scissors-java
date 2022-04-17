package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets's play Rock Paper Scissors");
        System.out.println("When i say 'shoot', Choose: rock, paper, or scissors");
        System.out.println("Are you ready? Write 'yes' if you are");


        String ready = scan.nextLine();

        if(ready.equals("yes")){
            System.out.println("Great!");
            System.out.println("rock -- paper -- scissors, shoot!");
            String playerChoice = scan.nextLine();
            System.out.println("\nYou chose:     " + playerChoice);
            System.out.println("The computer chose: " + computerChoice());
        } else{
            System.out.println("You lost, better luck next time!");
        }
    }

    public static String computerChoice(){

       double randomNumber = (int) Math.floor(Math.random() * 2);
        String choice = null;
        if(randomNumber == 0){
            choice = "rock";
        }else if(randomNumber == 1){
            choice = "paper";
        }else if(randomNumber == 3){
            choice = "scissors";
        }

return choice;
    }
}
