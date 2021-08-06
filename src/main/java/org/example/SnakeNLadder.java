package org.example;

/**
 * Snake and Ladder game where player starts at 0 position,
 * rolls dice to get random number(1-6)
 */
public class SnakeNLadder
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Snake and Ladder Game" );
        //variables
        int playerPosition=0;
        int playerDiceNumber= ((int) (Math.floor(Math.random() * 10)) % 6) + 1;
        System.out.println("Player starts at Position: "+playerPosition);
        System.out.println("Player rolled dice value : "+playerDiceNumber);
    }
}
