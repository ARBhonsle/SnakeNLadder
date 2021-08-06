package org.example;

/**
 * Snake and Ladder game where player starts at 0 position,
 * rolls dice to get random number(1-6) and randomly gets
 * assigned play options(No-play,Ladder,Snake) which moves player position accordingly
 * ie,No-play:no change,Ladder:Move forward,
 * Snake:Move backward(position reset to 0 if position becomes <0)
 * Game repeats until player reaches wining position(100) exactly
 */
public class SnakeNLadder
{
    public static void main( String[] args ) {
        System.out.println("Welcome to Snake and Ladder Game");
        //variables
        final int NO_PLAY = 0, LADDER = 1, SNAKE = 2, WIN_POSITION = 100;
        int playerPosition = 0,playerDiceNumber,playerOption;

        System.out.println("Player starts at Position: " + playerPosition);
        while (playerPosition < WIN_POSITION) {
            playerDiceNumber = ((int) (Math.floor(Math.random() * 10)) % 6) + 1;
            playerOption = (int) (Math.floor(Math.random() * 10)) % 3;
            System.out.println("Player rolled dice value : " + playerDiceNumber);

            switch (playerOption) {
                case NO_PLAY:
                    System.out.println("No Play");
                    break;
                case LADDER:
                    System.out.println("Ladder");
                    if((WIN_POSITION-playerDiceNumber)>=playerPosition)
                        playerPosition += playerDiceNumber;
                    else
                        System.out.println("Proper dice value required to win the game");
                    break;
                case SNAKE:
                    System.out.println("Snake");
                    if(playerPosition>playerDiceNumber)
                        playerPosition -= playerDiceNumber;
                    else {
                        playerPosition = 0;
                        System.out.println("Game Restarts, Player resets to position: 0");
                    }
                    break;
            }
            System.out.println("Player position: " + playerPosition);
        }
        System.out.println("Player wins the game!");
    }
}
