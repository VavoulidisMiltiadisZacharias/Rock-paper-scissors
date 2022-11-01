
public class Main 
{	
//Methods
	public static void checkWinner(Player player1, Player player2)
	{
		if(player1.getChoice().getKind() == "Rock" && player2.getChoice().getKind() == "Paper")
		{
			player2.setPoints(player2.getPoints()+1);
			System.out.println("Player2 wins the round!!!");
			System.out.println();
			System.out.println("-----------------------------------");
		}
		else if(player1.getChoice().getKind() == "Rock" && player2.getChoice().getKind() == "Scissors")
		{
			player1.setPoints(player1.getPoints()+1);
			System.out.println("Player1 wins the round!!!");
			System.out.println();
			System.out.println("-----------------------------------");
		}
			
		else if(player1.getChoice().getKind() == "Paper" && player2.getChoice().getKind() == "Rock") 
		{
			player1.setPoints(player1.getPoints()+1);
			System.out.println("Player1 wins the round!!!");
			System.out.println();
			System.out.println("-----------------------------------");
		}
			
		else if(player1.getChoice().getKind() == "Paper" && player2.getChoice().getKind() == "Scissors")
		{
			player2.setPoints(player2.getPoints()+1);
			System.out.println("Player2 wins the round!!!");
			System.out.println();
			System.out.println("-----------------------------------");
		}
			
		else if(player1.getChoice().getKind() == "Scissors" && player2.getChoice().getKind() == "Rock")
		{
			player2.setPoints(player2.getPoints()+1);
			System.out.println("Player2 wins the round!!!");
			System.out.println();
			System.out.println("-----------------------------------");
		}
			
		else if(player1.getChoice().getKind() == "Scissors" && player2.getChoice().getKind() == "Paper")
		{
			player1.setPoints(player1.getPoints()+1);
			System.out.println("Player1 wins the round!!!");
			System.out.println();
			System.out.println("-----------------------------------");
		}
			
		else
		{
			System.out.println("DRAW!!!");
			System.out.println();
			System.out.println("-----------------------------------");
		}
			
			
	}
	
	public static void main(String[] args) 
	{	
		//Create initial game conditions
		int round = 0;
		int maxRounds = 1;
		Player player1 = new Player(1, null, 0);
		Player player2 = new Player(2, null, 0);
		
		//Lets play for maxRounds rounds
		while(player1.getPoints() != 3 && player2.getPoints() !=3)
		{
			System.out.println("Round: " +(round+1));
			player1.makeChoice();
			player2.makeChoice();
			
			checkWinner(player1, player2);
			round++;
		}
		
		//Print final winner
		if(player1.getPoints() == 3)
		{
			System.out.println();
			System.out.println("Final Score -> Player1 vs Player2 : 3-"+player2.getPoints());
			System.out.println("Player 1 is the winner of the game !!!!!!!");
		}
		
		else if(player2.getPoints() == 3)
		{
			System.out.println();
			System.out.println("Final Score -> Player1 vs Player2 : "+player1.getPoints() +"-3");
			System.out.println("Player 2 is the winner of the game !!!!!!!");
		}
	}

}
