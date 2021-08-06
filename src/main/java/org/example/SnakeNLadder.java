package org.example;

/**
 * Hello world!
 *
 */
public class SnakeNLadder
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Snake and Ladder Game" );
        final int NO_PLAY=0,LADDER=1,SNAKE=2;
        int playerDiceNumber= ((int) (Math.floor(Math.random() * 10)) % 6) + 1;
        int playerOption=(int) (Math.floor(Math.random() * 10)) % 3;
        int playerPosition=0;
        System.out.println("Player starts at Position: "+playerPosition);
        System.out.println("Player rolled dice value : "+playerDiceNumber);
        switch (playerOption){
            case NO_PLAY:
                System.out.println("No Play");
                break;
            case LADDER:
                System.out.println("Ladder");
                playerPosition+=playerDiceNumber;
                break;
            case SNAKE:
                System.out.println("Snake");
                playerPosition-=playerDiceNumber;
                break;
        }
        System.out.println("Player position: "+playerPosition);
    }
}
