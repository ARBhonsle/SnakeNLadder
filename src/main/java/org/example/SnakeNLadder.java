package org.example;

/**
 * Snake and Ladder game where player starts at 0 position,
 * rolls dice to get random number(1-6) and randomly gets
 * assigned play options(No-play,Ladder,Snake) which moves player position accordingly
 * ie,No-play:no change,Ladder:Move forward,
 * Snake:Move backward(position reset to 0 if position becomes <0)
 * Game repeats until player reaches wining position(100) exactly
 * and displays number of times player rolls dice to win the game
 * Two players can play to check for winner
 */
public class SnakeNLadder
{
    public static void main( String[] args ) {
        System.out.println("Welcome to Snake and Ladder Game");
        //variables
        final int NO_PLAY = 0, LADDER = 1, SNAKE = 2, WIN_POSITION = 100;
        int playerDiceNumber,playerOption;
        int[] playerPosition = new int[2];
        int[] numberOfDiceRolls=new int[2];

        System.out.println("Player 1 and 2 starts at Position: 0");
        while (playerPosition[0] < WIN_POSITION && playerPosition[1]< WIN_POSITION) {
            for(int i=0;i<2;i++){
                playerDiceNumber = ((int) (Math.floor(Math.random() * 10)) % 6) + 1;
                numberOfDiceRolls[i]+=1;
                playerOption = (int) (Math.floor(Math.random() * 10)) % 3;
                System.out.println("Player "+(i+1)+" rolled dice value : " + playerDiceNumber);

                switch (playerOption) {
                    case NO_PLAY:
                        System.out.println("No Play");
                        break;
                    case LADDER:
                        System.out.println("Ladder");
                        if((WIN_POSITION-playerDiceNumber)>=playerPosition[i])
                            playerPosition[i] += playerDiceNumber;
                        else
                            System.out.println("Proper dice value required to win the game");
                        break;
                    case SNAKE:
                        System.out.println("Snake");
                        if(playerPosition[i]>playerDiceNumber)
                            playerPosition[i] -= playerDiceNumber;
                        else {
                            playerPosition[i] = 0;
                            System.out.println("Player "+(i+1)+"'s Game Restarts, reset to position: 0");
                        }
                        break;
                }
                System.out.println("Player "+(i+1)+" position: " + playerPosition[i]);
                if(playerPosition[i]==100){
                    break;
                }
                if(playerPosition[i]<WIN_POSITION && playerOption==LADDER){
                    System.out.println("Player "+(i+1)+" got Ladder, plays again");
                    i--;
                }
            }
            System.out.println();
        }
        if(playerPosition[0]==100){
            System.out.println("Player 1 wins the game!");
            System.out.println("Player 1 rolled the dice "+numberOfDiceRolls[0]+" times to win the game");
        }
        if(playerPosition[1]==100){
            System.out.println("Player 2 wins the game!");
            System.out.println("Player 2 rolled the dice "+numberOfDiceRolls[1]+" times to win the game");
        }
    }
}
