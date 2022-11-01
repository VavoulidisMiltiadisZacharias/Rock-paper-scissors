/*
 * Class that represents the player
 */

import java.lang.Math;

public class Player 
{

//Variables declaration
	private int id;
	private Choice choice;
	private int points;
	
//Constructors
	
	//Default constructor
	Player()
	{
		this.id = 0;
		this.choice = null;
		this.points = 0;
	}
	
	//Set constructor
	Player(int id, Choice choice, int points)
	{
		this.id = id;
		this.choice = choice;
		this.points = points;
	}
	
	//Object (copy) constructor
	Player(Player player)
	{
		this.id = player.id;
		this.choice = player.choice;
		this.points = player.points;
	}
	
//"Set" methods
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setChoice(Choice choice)
	{
		this.choice = choice;
	}
	
	public void setPoints(int points)
	{
		this.points = points;
	}
	
//"Get methods"
	public int getId()
	{
		return this.id;
	}
	
	public Choice getChoice()
	{
		return this.choice;
	}
	
	public int getPoints()
	{
		return this.points;
	}
	
//Methods
	public void makeChoice()
	{
		//Local variables
		int temp; //Helps to store the auto-generated number that represents the id of the choice
		int min = 1;
		int max = 4;
		
		this.choice = new Choice();
		
		System.out.println("Player"+this.getId()+" please make a choice");
		
		temp = (int) ((Math.random() * (max - min)) + min);
		this.choice.setId(temp);
		
		if(temp == 1)
			this.choice.setKind("Rock");
		else if(temp == 2)
			this.choice.setKind("Paper");
		else
			this.choice.setKind("Scissors");
		
		this.setChoice(this.choice);
		
		System.out.println("Player"+this.getId()+" made choice: "+this.getChoice().getKind());
		System.out.println();
	}
}
