public enum Roshambo {
ROCK,PAPER,SCISSORS;
	public String toString(){
       if(this == Roshambo.ROCK)
    	   return "Rock";
       else if(this == Roshambo.PAPER)
    	   return "Paper";
       else if(this == Roshambo.SCISSORS)
    	   return "Scissors";
       else
    	   return"Null";
        }
    }