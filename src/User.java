import java.util.Scanner;

public class User extends Player {
	static Scanner scan = new Scanner(System.in);
	static String name;
	static String opponent;
	public static void setName(){
		System.out.print("Enter your name: ");
		name = scan.nextLine();
	}
	public static char setOpponent(){
		System.out.print("Would you like to play against The Rock or Bob (r/b)?: ");
		opponent = scan.nextLine();
		opponent = opponent.toLowerCase();
		char firstLetter = opponent.charAt(0);
		return firstLetter;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Roshambo generateRoshambo() {
	System.out.print("Rock, Paper, Scissors?: ");
	String input = scan.nextLine();
    input = input.toUpperCase();
    char firstLetter = input.charAt(0);
    if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
        switch (firstLetter) {
        case 'R':
            return Roshambo.ROCK;
        case 'P':
            return Roshambo.PAPER;
        case 'S':
            return Roshambo.SCISSORS;
        }
    }
    return generateRoshambo();
	}

}
