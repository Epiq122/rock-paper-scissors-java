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
        } else{
            System.out.println("You lost, better luck next time!");
        }
    }
}
