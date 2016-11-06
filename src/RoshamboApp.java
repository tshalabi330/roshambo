
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Player user = new User();
		Player rock = new TheRock();
		Player comp = new TheComp();
		System.out.println("Welcome to Rock Paper Scissors!");
		User.setName();
		char firstLetter = User.setOpponent();
		Roshambo usermove = user.generateRoshambo();
		Roshambo opponentMove;
		String opponent;
		if (firstLetter == 'b') {
			opponent = comp.getName();
			opponentMove = comp.generateRoshambo();
		} else {
			opponent = rock.getName();
			opponentMove = rock.generateRoshambo();
		}
		System.out.println(user.getName() + ": " + usermove);
		System.out.println(opponent + ": " + opponentMove);
	}

}
