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
//	public int compareMoves(Roshambo otherMove){
//        if (this == otherMove)
//            return 0;
//        switch(this){
//        case ROCK:
//            return (otherMove == SCISSORS ? 1 : -1);
//        case PAPER:
//            return(otherMove == ROCK ? 1 : -1);
//        case SCISSORS:
//                return (otherMove == PAPER ? 1 : -1);
//                
//        }
//        return 0;
    }