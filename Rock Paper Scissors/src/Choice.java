/*
 * Class that represents the choice of the player (Rock, Paper or Scissors) 
 */


public class Choice 
{
	//Variables declaration
	private int id; // 1 ->Rock ... 2->Paper ... 3-> Scissors
	private String kind; //"Rock", "Paper", "Scissors"
	
//Constructors

	//Default constructor
	Choice()
	{
		this.id = 0;
		this.kind = null;
	}
	
	//Set constructor
	Choice(int id, String choice)
	{
		this.id = id;
		this.kind = choice;
	}
	
	//Object (copy) constructor
	Choice(Choice choise)
	{
		this.id = choise.id;
		this.kind = choise.kind;
	}
	
//"Set" methods
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setKind(String kind)
	{
		this.kind = kind;
	}
	
//"Get methods"
	public int getId()
	{
		return this.id;
	}
	
	public String getKind()
	{
		return this.kind;
	}
	
}
