package Test2;
import javax.swing.JOptionPane;
public class DiceGame 

{

	public static void main(String[] args) 
	{
		//set up  variable 
				boolean gameNotOver = true;

				//begin do loop
				do{	
					//Play the game with 1 die
					JOptionPane.showMessageDialog( null, "Let play the dice game!" );
					JOptionPane.showMessageDialog( null, "1-3 is Low and 4-6 is High" );

					
					Dice game1 = new Dice();
					int rollResult = game1.Roll();

					

					//ask the user to enter high or low
					String guess = JOptionPane.showInputDialog( null, "Enter (L) for Low or (H) for High" );

					
					
					if (guess.equalsIgnoreCase("H") && (rollResult >= 4))	
					{
						JOptionPane.showMessageDialog( null, "Your guess is right! The dice rolled was " + rollResult + "." + " It's High!" );
					}
					else if ( (guess.equalsIgnoreCase("L")) && (rollResult <= 3) )
					{
						JOptionPane.showMessageDialog( null, "Your guess is right! The dice rolled was " + rollResult + "." + " It's Low!" );			
					}
					else if (guess.equalsIgnoreCase("H") && rollResult <= 3)
					{
						JOptionPane.showMessageDialog( null, "Your guess is wrong!. The dice rolled was " + rollResult + "." + " It's Low!");
					}
					
					else
					{
						JOptionPane.showMessageDialog( null, "Your guess is wrong!. The dice rolled was " + rollResult + "." + " It's High!" );
					}


					//Play the game with 2 dices
					JOptionPane.showMessageDialog( null, "Ready to play with 2 dice now?" );
					JOptionPane.showMessageDialog( null, "1-6 is Low and 7-12 is High." );

				
					Dice game2 = new Dice();

					int rollResult1 = game1.Roll();
					int rollResult2 = game2.Roll();

					//total roll
					int totalRoll = (rollResult1 + rollResult2);

					

					//ask the user to enter high or low		
					guess = JOptionPane.showInputDialog( null, "The dice have been rolled. Guess high (enter h) or low (enter l)." );

					
					if ( (guess.equalsIgnoreCase("H")) && (totalRoll >= 7) )
					{
					JOptionPane.showMessageDialog( null, "Your guess is righ! The dices rolled was " + totalRoll + "." + " It's High" );
					}
					else if ( (guess.equalsIgnoreCase("L")) && (totalRoll <= 6) )
					{
						JOptionPane.showMessageDialog( null, "Your guess is righ! The dices rolled was " + totalRoll + "." + " It's Low");			
					}
					else if (guess.equalsIgnoreCase("H") && (totalRoll <=6))
					{
						JOptionPane.showMessageDialog( null, "Sorry! Your guess is wrong. The dices rolled was " + totalRoll + "." + " It's Low");
					}
					else 
					{
						JOptionPane.showMessageDialog( null, "Sorry! Your guess is wrong!. The dices rolled was " + totalRoll + "." + " It's High!" );
					}

					String playAgain = JOptionPane.showInputDialog( null, "Would you like to play again? (Y/N)" );

					if (playAgain.equalsIgnoreCase("N"))
					{
					gameNotOver = false;
					}
				} while(gameNotOver);

				//exit messages
				JOptionPane.showMessageDialog( null, "Good bye!" );



	}

}
