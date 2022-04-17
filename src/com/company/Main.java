package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets's play Rock Paper Scissors");
        System.out.println("When i say 'shoot', Choose: rock, paper, or scissors");
        System.out.println("Are you ready? Write 'yes' if you are");


        String ready = scan.nextLine();
        String computerChoice = computerChoice();

        if (ready.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock -- paper -- scissors, shoot!");
            String playerChoice = scan.nextLine();
            String result = result(playerChoice, computerChoice);
            printResult(playerChoice, computerChoice, result);

        } else {
            System.out.println("Fine dont play then!");
        }
    }


    public static String computerChoice() {

        double randomNumber = (int) Math.floor(Math.random() * 3);
        String choice = null;
        if (randomNumber == 0) {
            choice = "rock";
        } else if (randomNumber == 1) {
            choice = "paper";
        } else if (randomNumber == 2) {
            choice = "scissors";
        }

        return choice;
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals(computerChoice)) {
            result = "Its a Tie";
        }
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You Win";
        }
        if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You Win";
        }
        if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You Win";
        }

        if (computerChoice.equals("rock") && yourChoice.equals("scissors")) {
            result = "You Lose!";
        }
        if (computerChoice.equals("paper") && yourChoice.equals("rock")) {
            result = "You Lose";
        }
        if (computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            result = "You Lose";
        }


        return result;

    }

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose:     " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }
}
