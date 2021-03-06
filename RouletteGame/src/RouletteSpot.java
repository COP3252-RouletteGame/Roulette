public class RouletteSpot 
{
	private int payoff;
	private double bet = 0;
	
	public RouletteSpot(int n) { payoff = n; }// end constructor
	
	//Accessors:
	public double getBet () { return bet;}
	
	public int getPayoff () {return payoff;}
	
	//Mutator:
	public boolean setBet (double i)
	{
		if (i > 0)
		{
			bet = i;
			return true;
		}
		else
			bet = 0;
		return false;
	}// end setBet
	
	//Calculate:
	public double winning () { return payoff*bet + bet;}
	
}// end class