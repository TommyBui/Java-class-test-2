package Test2;

public class Dice
{
	private int lowBound,highBound;

	Dice()
	{
		lowBound = 1;
		highBound = 6;
	}

	public int Roll()
	{
		int number = lowBound + (int)(Math.random()* highBound);
		return number;
	}



}
