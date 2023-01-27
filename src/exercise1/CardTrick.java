package exercise1;

import java.util.Scanner;

/*
 * Karuna Verma 
 * Karuna Verma Jan 27, 2023
 */
public class CardTrick
{
    
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any number:");
        System.out.println("Enter any suit name:");
        int number ;
        String name ;
        number = keyboard.nextInt();
        name = keyboard.next();  
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) 
        {
            Card card = new Card();
            card.setValue((int) (Math.random()*13+1));
            card.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            hand[i]=card;
            System.out.println("The Card Name "+card.getValue()+" The Card Name "+card.getSuit());     
	}
        for (int k = 0; k<hand.length; k++)
        {
            if(hand[k].getValue()==number && hand[k].getSuit().equals(name))
            {
            printInfo();
            }
        }         
    }
    //I AM DONE !!!
    private static void printInfo() 
    {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Karuna Verma ");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Work in M.N.C");
       	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Dancing");
        System.out.println("-- Cooking");
        System.out.println("-- Watching Movies ");
        System.out.println();   
    }
}
